package br.com.server.webservice;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.server.dao.PersonDao;
import br.com.server.model.Person;

@WebService
@Stateless
public class PersonWS {

	@Inject
	private PersonDao personDao;

	@WebResult(name = "entities")
	public List<Person> getAllPersons() {
		return personDao.getAll();
	}

}
