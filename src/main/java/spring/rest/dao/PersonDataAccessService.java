package spring.rest.dao;

import org.springframework.stereotype.Repository;
import spring.rest.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("mysql")
public class PersonDataAccessService implements PersonDao {

    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        return List.of(new Person(UUID.randomUUID(), "From Mysql DB"));
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        return 0;
    }
}
