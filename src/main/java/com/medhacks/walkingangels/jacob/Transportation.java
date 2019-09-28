package com.medhacks.walkingangels.jacob;

<<<<<<< HEAD
import org.thymeleaf.spring5.processor.SpringActionTagProcessor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transportation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String transFrom;

    private String transTo;
=======
import com.medhacks.walkingangels.jen.Service;

import javax.persistence.Entity;

@Entity
public class Transportation extends Service {
>>>>>>> 41ccf6fac23f98d115f0f27a5cad8b777aabbea5
}
