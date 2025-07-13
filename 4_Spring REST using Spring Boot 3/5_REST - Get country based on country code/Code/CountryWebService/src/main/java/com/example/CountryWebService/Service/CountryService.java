package com.example.CountryWebService.Service;

import com.example.CountryWebService.Entity.Country;
import com.example.CountryWebService.Repository.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CountryService
{

    @Autowired
    private CountryRepo countryRepo;

    public Country add(Country country)
    {
        return countryRepo.save(country);
    }

    public List<Country> getAll()
    {
        return countryRepo.findAll();
    }

    public Optional<Country> findById(String Id)
    {
        return countryRepo.findById(Id);
    }


}