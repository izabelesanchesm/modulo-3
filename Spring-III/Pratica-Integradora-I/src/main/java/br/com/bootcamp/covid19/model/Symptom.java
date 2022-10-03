package br.com.bootcamp.covid19.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Symptom {
    private int code;
    private String name;
    private int severityLevel;
}
