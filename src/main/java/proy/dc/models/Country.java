/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.dc.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author cas_r
 */

@Entity
@Table(name = "countries")
@NamedQuery(name = "FindAll", query = "SELECT country FROM countries country")
public class Country {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPais")
    private int idCountry;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "continent")
    private String continent;

    public Country() {
    }

    public Country(int idCountry, String name, String continent) {
        this.idCountry = idCountry;
        this.name = name;
        this.continent = continent;
    }

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
    
    
    
    
    
}
