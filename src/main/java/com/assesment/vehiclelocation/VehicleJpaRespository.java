package com.assesment.vehiclelocation;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleJpaRespository extends JpaRepository<VehicleLocation, Integer> {

	Optional<VehicleLocation> findByVehicleNumber(String vehicleNumber);

}
