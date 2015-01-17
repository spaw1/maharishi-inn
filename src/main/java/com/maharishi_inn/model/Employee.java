/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maharishi_inn.model;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author s_paw_000
 */
@Entity
@DiscriminatorValue("Employee")
public class Employee extends Users implements Serializable{
    private String employeeID;
}
