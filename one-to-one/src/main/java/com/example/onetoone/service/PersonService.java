package com.example.onetoone.service;

import com.example.onetoone.model.Person;
import com.example.onetoone.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository;

	public Person save(Person person) {
		person.getAddress().setPerson(person);
		return personRepository.save(person);
	}

	public Iterable<Person> load() {
		return personRepository.findAll();
	}
}
