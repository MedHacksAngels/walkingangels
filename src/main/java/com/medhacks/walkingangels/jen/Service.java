package com.medhacks.walkingangels.jen;

import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Service {
<<<<<<< HEAD

=======
>>>>>>> 41ccf6fac23f98d115f0f27a5cad8b777aabbea5
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private boolean request; // true = request, false = offer;
    private String serviceType;
    private boolean urgent; // true = urgent, false = not urgent

    public Service() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isRequest() {
        return request;
    }

    public void setRequest(boolean request) {
        this.request = request;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }
}
