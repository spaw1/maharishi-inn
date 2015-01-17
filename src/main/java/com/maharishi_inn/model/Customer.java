/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maharishi_inn.model;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.Size;

/**
 *
 * @author s_paw_000
 */
@Entity
@DiscriminatorValue("Customer")
public class Customer extends Users implements Serializable{
    private String street;
    private String city;
    @Size(max=2)
    private String state;
    private String zip;
}
