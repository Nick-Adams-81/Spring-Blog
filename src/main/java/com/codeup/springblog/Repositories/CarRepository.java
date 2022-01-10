package com.codeup.springblog.Repositories;

import com.codeup.springblog.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
    Car findByMake(String make);
    Car findByModel(String model);
}
