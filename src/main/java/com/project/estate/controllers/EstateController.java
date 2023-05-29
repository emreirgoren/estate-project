package com.project.estate.controllers;

import com.project.estate.dataAccessRepos.EstateRepository;
import com.project.estate.entities.Estate;
import com.project.estate.services.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estate")
public class EstateController {

    @Autowired
    private EstateService estateService;

    public EstateController(EstateService estateService){
        this.estateService=estateService;
    }
    //Hepsini getir
    @GetMapping("/getAll")
    public List<Estate>getAllEstate(){
        return estateService.getAllEstates();
    }

    //Yaratma
    @PostMapping("/create")
    public Estate createEstate(@RequestBody Estate newEstate){
        return estateService.saveOneEstate(newEstate);
    }

    //1 tane getirme
    @GetMapping("/getOneEstate/{estateId}")
    public Estate getOneEstate(@PathVariable Long estateId){
        return estateService.getOneEstate(estateId);
    }

    //Update Etme
    @PutMapping("/update")
    public Estate updateOneEstate(@PathVariable Long estateId, @RequestBody Estate newEstate) {
        return estateService.updateOneUser(estateId,newEstate);
    }

    //Silme
    @DeleteMapping("/delete")
    public void deleteOneEstate(@PathVariable Long estateId){
        estateService.deleteOneEstate(estateId);
    }

}
