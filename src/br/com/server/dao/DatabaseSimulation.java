package br.com.server.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

import br.com.server.model.Person;

@Singleton
public class DatabaseSimulation {
	private List<Person> persons = new ArrayList<Person>();
	
	@PostConstruct
	public void initDataBase() {
		persons = new ArrayList<Person>();
		persons.add(new Person(1, "Heitor"));
		persons.add(new Person(2, "Helena"));
		persons.add(new Person(3, "Tais"));
		persons.add(new Person(4, "Joca"));
	}
	
	public List<Person> getAllPersons(){
		return persons;
	}
}
