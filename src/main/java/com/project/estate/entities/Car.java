package com.project.estate.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="abc")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long carId;

    @Column(name="car_gear")
    String carGear;

    @Column(name="car_model")
    String carModel;

}