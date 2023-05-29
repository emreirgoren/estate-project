package com.project.estate.dataAccessRepos;

import com.project.estate.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {

}
