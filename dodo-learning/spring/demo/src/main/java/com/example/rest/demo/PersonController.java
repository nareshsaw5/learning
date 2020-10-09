package com.example.rest.demo;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/person")
public class PersonController {
	
	Logger LOGGER  = LoggerFactory.getLogger(PersonController.class);
	
	@RequestMapping(path="")
	public List<Person> getPersons(){
		
		return Arrays.asList( new Person(1, "Naresh Saw"), new Person(2, "Suresh"));
	}

}
