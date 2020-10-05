package spring.rest.service;

import spring.rest.dao.PersonDao;
import spring.rest.model.Person;

public class PersonService {
    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }
}
