package com.example.onetoone.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Person {
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
//to avoid 
	// @OneToOne(mappedBy="person",cascade = CascadeType.ALL)//this only changed
	// foreign key
	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
	private Address address;

//for saving  address and person we require cascade 

}

/*
 * 
 * { "id":1, "firstName":"rohan", "lastName":"kumar", "age":22, "address":{
 * "id":101, "houseNo":"123/M", "streetName":"btm", "person": { "id":1 } }
 * 
 * 
 * 
 * 
 * { "id":101, "houseNo":"123/M", "streetName":"btm", "person": { "id":1 } }
 * 
 * 
 * 
 * 
 * 
 */