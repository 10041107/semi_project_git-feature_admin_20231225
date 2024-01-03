package com.semiproject.pettales.AAmypage.doglistchange.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.semiproject.pettales.AAmypage.doglistchange.entity.PetTable;
import com.semiproject.pettales.AAmypage.doglistchange.repository.PetUpdateRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PetUpdateService {

    private final PetUpdateRepository petUpdateRepository;

    @Autowired
    public PetUpdateService(PetUpdateRepository petUpdateRepository) {
        this.petUpdateRepository = petUpdateRepository;
    }

    public PetTable createPet(PetTable pet) {
        return petUpdateRepository.save(pet);
    }

    public List<PetTable> getPets() {
        return petUpdateRepository.findAll();
    }

    public PetTable updatePet(int petCode, PetTable pet) {
        Optional<PetTable> oldPet = petUpdateRepository.findById(petCode);
        if(oldPet.isPresent()) {
            PetTable updatedPet = oldPet.get();
            updatedPet.setPetName(pet.getPetName());
            updatedPet.setPetStatus(pet.getPetStatus());
            updatedPet.setPetSpecies(pet.getPetSpecies());
            updatedPet.setPetWeight(pet.getPetWeight());
            updatedPet.setUpdateDate(pet.getUpdateDate());
            return petUpdateRepository.save(updatedPet);
        }
        else {
            throw new RuntimeException("Pet not found with petCode: " + petCode);
        }
    }

    public void deletePet(int petCode) {
        petUpdateRepository.deleteById(petCode);
    }
}
