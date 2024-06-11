package com.assesment.vehiclelocation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

	@Autowired
	KafkaTemplate<String, VehicleLocation> kafkaTemplate;

	@Autowired
	private VehicleJpaRespository repository;

	public List<VehicleLocation> getAllVehicles() {
		return repository.findAll();
	}

	public VehicleLocation createVehicle(VehicleLocation location) {
		return repository.save(location);
	}

	public VehicleLocation generateLocation(VehicleLocation location) {

		Optional<VehicleLocation> findByVehicleNumber = repository.findByVehicleNumber(location.getVehicleNumber());

		if (findByVehicleNumber.isEmpty()) {
			throw new RuntimeException(String.format("Vehicle Number :{} Not found :", location.getVehicleNumber()));
		}
		VehicleLocation vehicle = findByVehicleNumber.get();
		vehicle.setLat(location.getLat());
		vehicle.setLongitude(location.getLongitude());
		repository.save(vehicle);
		kafkaTemplate.send("vehicle_location", vehicle);
		return vehicle;
	}

}
