package com.medhacks.walkingangels.jacob;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Translation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String langFrom;

    private String langTo;


}
