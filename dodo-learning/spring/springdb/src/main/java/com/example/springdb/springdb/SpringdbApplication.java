package com.example.springdb.springdb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdbApplication implements CommandLineRunner {
	
	Logger LOGGER = LoggerFactory.getLogger(SpringdbApplication.class);
	
	@Autowired
	PersonDao personDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringdbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("{} ", personDao.findAll());
		
	}

}
