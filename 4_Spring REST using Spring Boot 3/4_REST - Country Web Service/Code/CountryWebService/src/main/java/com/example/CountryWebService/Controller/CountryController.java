package com.example.CountryWebService.Controller;

import com.example.CountryWebService.Entity.Country;
import com.example.CountryWebService.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CountryController
{

    @Autowired
    CountryService countryService;

    @PostMapping("/add")
    public ResponseEntity<Country> add(@RequestBody Country country)
    {
        return ResponseEntity.status(HttpStatus.OK).body(countryService.add(country));
    }

    @GetMapping("/country")
    public Country get()
    {
        Country india = new Country();
        india.setCode("IN");
        india.setName("India");
        return india;
    }

    @GetMapping("/countries")
    public ResponseEntity<List<Country>> getAll()
    {
        return ResponseEntity.status(HttpStatus.OK).body(countryService.getAll());
    }

    @GetMapping("/{Id}")
    public ResponseEntity<Optional<Country>> findByID(@PathVariable String Id)
    {
        return ResponseEntity.status(HttpStatus.OK).body(countryService.findById(Id));
    }

}