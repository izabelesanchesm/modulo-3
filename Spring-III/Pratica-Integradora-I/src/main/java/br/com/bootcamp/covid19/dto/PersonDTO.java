package br.com.bootcamp.covid19.dto;

import br.com.bootcamp.covid19.model.Person;
import lombok.Data;

@Data
public class PersonDTO {

    private String name;
    private String lastName;
    private int age;

    public PersonDTO(Person person){
        this.name = person.getName();
        this.lastName = person.getLastName();
        this.age = person.getAge();
    }
}
