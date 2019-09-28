package com.medhacks.walkingangels.oona;

import com.medhacks.walkingangels.jen.Service;

import javax.persistence.Entity;

@Entity
public class Education extends Service{
    private String teach;
    private String learn;
    private String other;

    public Education() {
    }

    public String getTeach() {
        return teach;
    }

    public void setTeach(String teach) {
        this.teach = teach;
    }

    public String getLearn() {
        return learn;
    }

    public void setLearn(String learn) {
        this.learn = learn;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}

