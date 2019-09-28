package com.medhacks.walkingangels.jacob;

import com.medhacks.walkingangels.jen.Service;

import javax.persistence.Entity;

@Entity
public class Translation extends Service {

    private String langFrom;
    private String langTo;

    public Translation() {
    }

    public Translation(String langFrom, String langTo) {
        this.langFrom = langFrom;
        this.langTo = langTo;
    }

    public String getLangFrom() {
        return langFrom;
    }

    public void setLangFrom(String langFrom) {
        this.langFrom = langFrom;
    }

    public String getLangTo() {
        return langTo;
    }

    public void setLangTo(String langTo) {
        this.langTo = langTo;
    }
}
