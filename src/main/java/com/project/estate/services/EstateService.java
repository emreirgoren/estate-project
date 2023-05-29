package com.project.estate.services;

import com.project.estate.dataAccessRepos.EstateRepository;
import com.project.estate.entities.Estate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstateService {

    EstateRepository estateRepository;

    public EstateService (EstateRepository estateRepository){
        this.estateRepository=estateRepository;
    }

    //Hepsini getirme
    public List<Estate> getAllEstates() {
        return estateRepository.findAll();
    }

    //Kaydetme Yaratma
    public Estate saveOneEstate(Estate newEstate) {
        return estateRepository.save(newEstate);
    }

    //1 tane Getirme
    public Estate getOneEstate(Long estateId) {
        return estateRepository.findById(estateId).orElse(null);
    }

    //Update Etme
    public Estate updateOneUser(Long estateId, Estate newEstate) {
        Optional<Estate> estate = estateRepository.findById(estateId);
        if (estate.isPresent()) {
            Estate foundEstate = estate.get();
            foundEstate.setChamber(newEstate.getChamber());
            foundEstate.setLocation((newEstate.getLocation()));
            estateRepository.save(foundEstate);
            return foundEstate;
        }else{
            return null;
        }
    }

    //Silme
    public void deleteOneEstate(Long estateId) {
        estateRepository.deleteById(estateId);
    }
}
