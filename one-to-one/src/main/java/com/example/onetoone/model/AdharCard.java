package com.example.onetoone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class AdharCard {
	@Id
	private Integer id;
	private String houseNo;
	private String streetName;
	private Long adharNo;

	@OneToOne
	private Student student;

}

/*
 * 
 * { "id":5386, "houseNo":"714/DNP", "streetName":"Dhanapur Chandauli",
 * "adharNo":6455 "student":{ "id":1} }
 * 
 * 
 */
