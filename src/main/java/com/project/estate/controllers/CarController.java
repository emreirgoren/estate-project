package com.project.estate.controllers;

import com.project.estate.dataAccessRepos.CarRepository;
import com.project.estate.entities.Car;
import com.project.estate.services.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/car")
public class CarController {

    private CarService carService;

    public CarController(CarService carService){
        this.carService=carService;
    }

    //Hepsini getir
    @GetMapping("/getAll")
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }

    //Yaratma
    @PostMapping("/create")
    public Car createCar(@RequestBody Car newCar){
        return carService.saveOneCar(newCar);
    }

    //1 Tane Getirme
    @GetMapping("/getOneCar")
    public Car getOneCar(@PathVariable Long carId){
        return carService.getOneCar(carId);
    }

    //Update Etme
    @PutMapping("/update")
    public Car updateOneCar(@PathVariable Long carId,@RequestBody Car newCar){
        return  carService.updateOneCar(carId,newCar);
    }

    //Delete
    @DeleteMapping("/delete")
    public void deleteOneCar(@PathVariable Long carId){
        carService.deleteOneCar(carId);
    }

}
