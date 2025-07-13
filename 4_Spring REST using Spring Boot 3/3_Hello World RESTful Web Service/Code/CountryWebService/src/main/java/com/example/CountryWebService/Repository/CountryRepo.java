package com.example.CountryWebService.Repository;

import com.example.CountryWebService.Entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepo extends JpaRepository<Country,String>
{

}
