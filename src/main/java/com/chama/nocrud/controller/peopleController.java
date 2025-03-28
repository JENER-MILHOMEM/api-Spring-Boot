package com.chama.nocrud.controller;

import com.chama.nocrud.models.peopleModel;
import com.chama.nocrud.repositories.peopleRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/people")
public class peopleController {
    @Autowired
    private peopleRepositories peopleRepositorie;

    @GetMapping
    public ResponseEntity<?> GetPeople() {
        return ResponseEntity.ok(peopleRepositorie.findAll());
    }

    @PostMapping
    public peopleModel createpeople(@RequestBody peopleModel PeopleModel) {
        return ResponseEntity.ok(peopleRepositorie.save(PeopleModel)).getBody();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePeople(@PathVariable(value = "id" ) UUID id) {
        return peopleRepositorie.findById(id)
                .map(people -> {
                    peopleRepositorie.delete(people);
                    return ResponseEntity.ok(people);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
    @GetMapping("/test")
    public String test() {
        return "Controller funcionando!";
    }
}
