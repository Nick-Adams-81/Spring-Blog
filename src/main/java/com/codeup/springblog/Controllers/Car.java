package com.codeup.springblog.Controllers;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String make;

    @Column(nullable = false, length = 100)
    private String model;

    @ManyToMany(mappedBy = "vehicle")
    private List<Owner> carOwner;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

}
