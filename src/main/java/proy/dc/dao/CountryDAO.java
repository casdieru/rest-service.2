/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.dc.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import proy.dc.models.Country;

/**
 *
 * @author cas_r
 */

@Stateless
public class CountryDAO implements ICountryDAO{

    EntityManager entityManager;
    
    @Override
    public List<Country> getAllCountries() {
        return entityManager.createNamedQuery("FindAll").getResultList();
    }

    @Override
    public Country findCountryByID(Country country) {
        return entityManager.find(Country.class, country.getIdCountry());
    }

    @Override
    public void createCountry(Country country) {
        entityManager.persist(country);
    }

    @Override
    public void updateCountry(Country country) {
        entityManager.merge(country);
    }

    @Override
    public void deleteCountry(Country country) {
        entityManager.remove(entityManager.merge(country));
    }
    
}
