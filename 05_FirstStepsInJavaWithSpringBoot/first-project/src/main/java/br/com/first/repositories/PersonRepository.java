package br.com.first.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.first.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
