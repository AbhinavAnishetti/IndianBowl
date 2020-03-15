package com.ava.indianbowl.resourcecontroller;

import com.ava.indianbowl.resource.Filling;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("fillings")
public class FillingController {

    List<Filling> fillings = new ArrayList<>();
    public FillingController(){
        fillings.add(new Filling("Salsa", 1.5));
        fillings.add(new Filling("Gaucamole", 2.5));
        fillings.add(new Filling("Paneer", 3.5));
        fillings.add(new Filling("Cilantro", 0.5));
    }


    @GetMapping
    public List<Filling> getFilling(){
        return fillings;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createFilling(@RequestBody Filling filling){
       fillings.add(filling);
    }

    @GetMapping("/{id}")
    public Filling getFillingWithID(@PathVariable("id") final int id){
        final Filling filling = fillings.get(id);
        return filling;
    }
}
