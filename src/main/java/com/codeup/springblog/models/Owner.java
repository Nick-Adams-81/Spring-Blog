package com.codeup.springblog.models;

import com.codeup.springblog.models.Car;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="owners")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;


    @ManyToMany
    @JoinTable(name="vehicles_owner", joinColumns = {@JoinColumn(name="owner_id")}, inverseJoinColumns = {@JoinColumn(name="car_id")})
    private List<Car> vehicle;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
