package com.project.estate.services;

import com.project.estate.dataAccessRepos.CarRepository;
import com.project.estate.entities.Car;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    //Hepsini getirme
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    //Kaydetme Yaratma
    public Car saveOneCar(Car newCar) {
        return carRepository.save(newCar);
    }

    //1 Tane Getirme
    public Car getOneCar(Long carId) {
        return carRepository.findById(carId).orElse(null);
    }

    //Update Etme
    public Car updateOneCar(Long carId, Car newCar) {
        Optional<Car> car = carRepository.findById(carId);
        if(car.isPresent()){
            Car foundCar = car.get();
            foundCar.setCarGear(newCar.getCarGear());
            foundCar.setCarModel(newCar.getCarModel());
            carRepository.save(foundCar);
            return foundCar;
        }else {
            return null;
        }
    }

    //Silme
    public void deleteOneCar(Long carId) {
        carRepository.deleteById(carId);
    }
}

