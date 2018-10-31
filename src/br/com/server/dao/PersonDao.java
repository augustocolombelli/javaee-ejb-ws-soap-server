package br.com.server.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.server.model.Person;

@Stateless
public class PersonDao {

	@Inject
	private DatabaseSimulation dataBase;

	public List<Person> getAll() {
		return dataBase.getAllPersons();
	}

}
