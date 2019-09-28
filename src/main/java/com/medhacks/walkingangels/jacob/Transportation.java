package com.medhacks.walkingangels.jacob;

import org.thymeleaf.spring5.processor.SpringActionTagProcessor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Transportation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String transFrom;

    private String transTo;
}
