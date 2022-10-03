package br.com.bootcamp.covid19.dto;

import br.com.bootcamp.covid19.model.Symptom;
import lombok.Data;

@Data
public class SymptomDTO {

    private String name;
    private int severityLevel;

    public SymptomDTO(Symptom symptom){
        this.name = symptom.getName();
        this.severityLevel = symptom.getSeverityLevel();
    }
}
