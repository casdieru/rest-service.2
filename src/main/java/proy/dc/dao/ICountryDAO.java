/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.dc.dao;

import java.util.List;
import proy.dc.models.Country;
import javax.ejb.Local;

/**
 *
 * @author cas_r
 */

@Local
public interface ICountryDAO {
    
    public List<Country> getAllCountries();
    
    public Country findCountryByID(Country country);
    
    public void createCountry (Country country);
    
    public void updateCountry (Country country);
    
    public void deleteCountry (Country country);
    
}
