package com.example.onetoone.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Address {
	@Id
	private Integer id;
	private String houseNo;
	private String streetName;

	@OneToOne
	@JsonIgnore
	private Person person;


}
