package com.assesment.vehiclelocation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class VehiclelocationApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehiclelocationApplication.class, args);
	}

	/*
	 * @Bean CommandLineRunner commandLineRunner(KafkaTemplate<String,
	 * VehicleLocation> kafkaTemplate) { return args -> {
	 * kafkaTemplate.send("vehicle_location", new VehicleLocation(1, "mh14je1",
	 * 10.52, 10.36)); kafkaTemplate.send("vehicle_location", new VehicleLocation(2,
	 * "mh14je2", 10.52, 10.36)); kafkaTemplate.send("vehicle_location", new
	 * VehicleLocation(3, "mh14je3", 10.52, 10.36));
	 * kafkaTemplate.send("vehicle_location", new VehicleLocation(4, "mh14je4",
	 * 10.52, 10.36));
	 * 
	 * };
	 * 
	 * }
	 */

}
