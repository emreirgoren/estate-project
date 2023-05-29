package com.project.estate.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="estate")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Estate {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long estateId;

    private String user;

    @Column(name="estate_chamber")
    Long chamber;

    @Column(name="estate_location")
    String location;
}
