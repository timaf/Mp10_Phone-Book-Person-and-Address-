package at.refugeescode.PhoneBook.persistance.endpoint;

import at.refugeescode.PhoneBook.persistance.Model.Person;
import at.refugeescode.PhoneBook.persistance.Repository.PersonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class PersonRestController {

    private PersonRepository personRepository;

    public PersonRestController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping
    List<Person> bringAll(){
       return personRepository.findAll();
    }

    @PostMapping
    Person createContact(@RequestBody Person person){
        return personRepository.save(person);

    }
}

/*Mp10 - Phone Book (Person and Address) [oneToOne]
        The PhoneBook app will have an endpoint /contacts where you can post new contacts.
        A get request to /contacts shows all of them. Internally,
        the app will connect to a Sql database like MySQL and have one entity called Person and another one called Address.
        They are both connected with a one to one relationship.
        The Address will be saved in the database as a cascade operation from the Person repository.*/
