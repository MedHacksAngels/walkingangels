package com.medhacks.walkingangels.jen;

import javax.persistence.Entity;
<<<<<<< HEAD
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
=======

@Entity
public class Womens extends Service{
>>>>>>> 41ccf6fac23f98d115f0f27a5cad8b777aabbea5


}
