package com.codeup.springblog.Controllers;

import com.codeup.springblog.Repositories.CarRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {
    private final CarRepository carDao;

    public CarController(CarRepository carDao) {
        this.carDao = carDao;
    }

    @GetMapping("/cars")
    public String carIndex(Model model) {
           model.addAttribute("cars", carDao.findAll());
           model.addAttribute("ford", carDao.findByMake("ford"));
           model.addAttribute("tesla", carDao.findByModel("cybertruck"));
       return "cars";
    }



}
