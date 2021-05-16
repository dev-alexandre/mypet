package br.com.mypet.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Pet {

    private Long id;
    private String name;
    private LocalDate birthDate;

}
