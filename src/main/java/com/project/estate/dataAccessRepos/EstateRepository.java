package com.project.estate.dataAccessRepos;

import com.project.estate.entities.Estate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstateRepository extends JpaRepository<Estate,Long> {

    Estate findByLocation(String location);

}
