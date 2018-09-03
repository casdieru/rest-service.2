/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.dc.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proy.dc.models.Country;
import proy.dc.services.CountryService;

/**
 *
 * @author cas_r
 */

@RestController
@RequestMapping("/countries") 
public class CountryController {
    
    @Autowired
    CountryService countryService;
    
    @GetMapping("/country")
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }
    
    @PostMapping("/country")
    public void createCountry(@RequestBody Country country){
        countryService.createCountry(country);
    }
    
    @PutMapping("/country/{id_coun}")
    public void updateCountry(@PathVariable Integer idCountry, @RequestBody Country country){
        countryService.updateCountry(country);
    }
    
    @DeleteMapping("/country/{id_coun}")
    public void deleteCountry(@PathVariable Integer idCountry, @RequestBody Country country){
        countryService.deleteCountry(country);
    }
    
}











