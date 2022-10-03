package br.com.bootcamp.covid19.controller;

import br.com.bootcamp.covid19.dto.SymptomDTO;
import br.com.bootcamp.covid19.model.Symptom;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/symptom")
public class SymptomController {

    private List<Symptom> symptoms = new ArrayList<>();

    @GetMapping()
    public ResponseEntity<List<Symptom>> findSymptom(){
        return new ResponseEntity<>(symptoms, HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<SymptomDTO> findSymptom(@PathVariable String name){
        Optional<Symptom> symptom = symptoms.stream().filter(s -> s.getName() == name).findFirst();
        if (symptom.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        SymptomDTO dto = new SymptomDTO(symptom.get());
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Symptom> newSymptom(@RequestBody Symptom symptom){
        symptom.setCode(symptoms.size() + 1);
        symptoms.add(symptom);
        return new ResponseEntity<>(symptom, HttpStatus.CREATED);
    }


}
