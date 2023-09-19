package com.example.democalculator.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public interface CalculatorOperation {

    @GetMapping(value = "/string")
    List<String> String();

    // http://localhost:8081/api/v1/add?x=10&y=20
    @GetMapping(value = "/add") // end point // return class do not return primitive
    Integer add(@RequestParam(name = "x") int salary // name or value same meaning
            , @RequestParam(name = "y") int bnous //
            , @RequestParam(name = "z", required = false,
                    defaultValue = "100") String dividend //
            , @RequestParam int k); // RequestParam usually for internal

    // http://localhost:8081/api/v1/substract/10/20/30
    @GetMapping(value = {"/substract/{x}/{y}/{z}" //
            , "/substract/{x}/{y}"}) // end point // return class do not return primitive
    Integer substract(@PathVariable(name = "x") int salary //
            , @PathVariable int y //
            , @PathVariable(required = false) String z);
}
