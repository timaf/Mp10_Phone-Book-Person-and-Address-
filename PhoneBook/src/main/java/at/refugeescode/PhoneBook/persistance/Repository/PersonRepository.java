package at.refugeescode.PhoneBook.persistance.Repository;

import at.refugeescode.PhoneBook.persistance.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
