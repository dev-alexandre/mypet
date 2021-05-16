package br.com.mypet.controller;

import br.com.mypet.domain.Pet;
import br.com.mypet.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;


/**
* Use o crud disponivel na classe PetService
**/


@RestController
@RequestMapping(value = "/pet")
public class PetController {

    public static final Logger logger = Logger.getLogger(PetController.class.getName());

    @Autowired
    private PetService petService;

    @ResponseBody
    @GetMapping("/all")
    public ResponseEntity<List<Pet>> listAll() {
        logger.info("listing all pets");
        return ResponseEntity.ok(petService.read());
    }



}
