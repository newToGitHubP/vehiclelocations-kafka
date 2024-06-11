package com.assesment.vehiclelocation;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehiclelocation")
public class VehicleLocation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "vehicleNumber", nullable = false)
	private String vehicleNumber;
	@Column(name = "latitude", nullable = true)
	private Double lat;
	@Column(name = "longitude", nullable = true)
	private Double longitude;

	
	
	public VehicleLocation() {
		super();
	}

	public VehicleLocation(Integer id, String vehicleNumber, Double lat, Double longitude) {
		super();
		this.id = id;
		this.vehicleNumber = vehicleNumber;
		this.lat = lat;
		this.longitude = longitude;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "VehicleLocation [id=" + id + ", vehicleNumber=" + vehicleNumber + ", lat=" + lat + ", longitude="
				+ longitude + "]";
	}

}
