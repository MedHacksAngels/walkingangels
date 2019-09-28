package com.medhacks.walkingangels.jacob;

import com.medhacks.walkingangels.jen.Service;

import javax.persistence.Entity;

@Entity
public class Transportation extends Service {

    private String transFrom;
    private String transTo;

    public Transportation() {
    }

    public Transportation(String transFrom, String transTo) {
        this.transFrom = transFrom;
        this.transTo = transTo;
    }

    public String getTransFrom() {
        return transFrom;
    }

    public void setTransFrom(String transFrom) {
        this.transFrom = transFrom;
    }

    public String getTransTo() {
        return transTo;
    }

    public void setTransTo(String transTo) {
        this.transTo = transTo;
    }
}
