package CurdOperation.webapplication;

import java.util.List;
import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class PersonRestcontroller {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping(value = { "/api/", "/api/{id}" })
    public Person getDefaultEmployeesByIdWithOptional(@PathVariable Optional<Long> id) {
        Person p=new Person();
        if (id.isPresent()) {
            p= personRepository.findById(id.get()).get();            
            return p;

        } else {
            return p;
        }
    }
 
    @GetMapping("/")
    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }
 
    @PostMapping("/")
    public Person savePerson(@RequestBody Person person) {
        return personRepository.save(person);
    }
 
    @PutMapping("/")
    public Person updatePerson(@RequestBody Person person) {
        return personRepository.save(person);
    }
 
    @DeleteMapping("/")
    public String deletePerson(@RequestBody Person person) {
        personRepository.delete(person);
        return "deleted Successfully";
    }
}