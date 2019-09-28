package com.medhacks.walkingangels.jen;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Womens {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public void print(){
        System.out.println("works");
    }


}
