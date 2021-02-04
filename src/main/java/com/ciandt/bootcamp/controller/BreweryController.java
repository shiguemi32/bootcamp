package com.ciandt.bootcamp.controller;

import com.ciandt.bootcamp.model.api.GetBreweryResponse;
import com.ciandt.bootcamp.service.BreweryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/brewery")
public class BreweryController {

    private final BreweryService breweryService;

    public BreweryController(BreweryService breweryService) {
        this.breweryService = breweryService;
    }

    @GetMapping
    public List<GetBreweryResponse> findAll() {
        return this.breweryService.findAll();
    }

}