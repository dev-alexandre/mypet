package br.com.mypet.db;

import br.com.mypet.domain.Pet;
import br.com.mypet.domain.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class BDSimulator {

  private static BDSimulator instance;

  @Getter
  @Setter
  private List<Pet> pets;

  private BDSimulator() {
    pets = getInitialPets();
  }

  public static synchronized BDSimulator getInstance() {
    return instance == null ? instance = new BDSimulator() : instance;
  }

  private List<Pet> getInitialPets(){
    return
      Arrays
        .asList(
          new Pet(1L,"Bigode", LocalDate.of(2018, Month.APRIL,1)),
          new Pet(2L,"Caolho", LocalDate.of(2017, Month.FEBRUARY,1)),
          new Pet(2L,"Rancor", LocalDate.of(2015, Month.MAY,1)),
          new Pet(4L,null,     LocalDate.of(2014, Month.SEPTEMBER,1)),
          new Pet(4L,"Mingal", null)
        );
  }



}