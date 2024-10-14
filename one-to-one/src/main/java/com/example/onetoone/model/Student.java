package com.example.onetoone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;

}
/*
 {
 " id":1,
 "firstName":"Rohan",
" lastName":"Kumar",
 " age":22
 }
 
 
 { "id":8236,
 "houseNo":"714/DNP",
 "streetName":"Dhanapur Chandauli",
  "adharNo":645560829136,
 "student":
 { 
   "id":2
 } 
}
 
 
 */





