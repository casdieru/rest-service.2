/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.dc.services;

import java.util.List;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import org.springframework.beans.factory.annotation.Autowired;
import proy.dc.dao.CountryDAO;
import proy.dc.dao.ICountryDAO;
import proy.dc.models.Country;

/**
 *
 * @author cas_r
 */

@Stateless
public class CountryService implements ICountryDAO{

    @Resource
    private SessionContext sessionContext;
    
    @Autowired
    CountryDAO countryDAO;
    
    @Override
    public List<Country> getAllCountries() {
        return countryDAO.getAllCountries();
    }

    @Override
    public Country findCountryByID(Country country) {
        return countryDAO.findCountryByID(country);
    }

    @Override
    public void createCountry(Country country) {
        countryDAO.createCountry(country);
    }

    @Override
    public void updateCountry(Country country) {
        countryDAO.updateCountry(country);
    }

    @Override
    public void deleteCountry(Country country) {
        countryDAO.deleteCountry(country);
    }
    
}
