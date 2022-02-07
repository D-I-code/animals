package com.qa.animals.rest;

import com.qa.animals.domain.Animals;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AnimalsController {

    private List<Animals> animalList = new ArrayList<>();

    //Response entity -> will allow us to configure the status of the response

    //C-R-U-D

    //Create
    //Response to return instead of 200: 201 - created
    @PostMapping("/createAnimal")
    public ResponseEntity<Animals> createAnimal(@RequestBody Animals a) {
        this.animalList.add(a);
        Animals newAnimal = this.animalList.get(this.animalList.size() - 1);
        return new ResponseEntity<>(newAnimal, HttpStatus.CREATED);
    }


}