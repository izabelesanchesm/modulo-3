package br.com.bootcamp.covid19.controller;

import br.com.bootcamp.covid19.dto.PersonDTO;
import br.com.bootcamp.covid19.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/person")
public class PersonController {

    private List<Person> personList = new ArrayList<>();

    @GetMapping("/teste")
    public String teste(){
        return "olá";
    }

    @GetMapping("/findRiskPerson")
    public ResponseEntity<List<PersonDTO>> findRiskPerson(){

        List<Person> person = personList.stream().filter(p -> p.getAge() > 60).collect(Collectors.toList());
        List<PersonDTO> personDTOList = person.stream()
                                        .map(p-> new PersonDTO(p))
                                        .collect(Collectors.toList());

        if (personDTOList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(personDTOList, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Person> newPerson(@RequestBody Person person){
        person.setId(personList.size() + 1);
        personList.add(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }


}
