package com.example.springdb.springdb;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Person> findAll(){
		return entityManager.createNamedQuery("get_all_person", Person.class).getResultList();
	}

}
