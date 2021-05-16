package br.com.mypet.service;

import br.com.mypet.db.BDSimulator;
import br.com.mypet.domain.Pet;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    public void create(Pet pet){
        pet.setId(BDSimulator.getInstance().getPets().size() + 1L);
        BDSimulator.getInstance().getPets().add(pet);
    }

    public List<Pet> read(){
       return BDSimulator.getInstance().getPets();
    }

    public void update(Pet pet){
        if(BDSimulator.getInstance().getPets().stream().anyMatch(p -> p.getId().equals(pet.getId()))){
            delete(pet.getId());
            create(pet);
        }
    }

    public void delete(Long id){
        BDSimulator.getInstance().getPets().removeIf(p -> p.getId().equals(id));
    }

}
