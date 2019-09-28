package com.medhacks.walkingangels.jacob;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Translation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String langFrom;

    private String langTo;


=======
import com.medhacks.walkingangels.jen.Service;

import javax.persistence.Entity;

@Entity
public class Translation extends Service {
>>>>>>> 41ccf6fac23f98d115f0f27a5cad8b777aabbea5
}
