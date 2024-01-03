package com.semiproject.pettales.AAmypage.doglistchange.controller;

import com.semiproject.pettales.AAmypage.doglistchange.entity.PetTable;
import com.semiproject.pettales.AAmypage.doglistchange.service.PetUpdateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/myPets")
public class PetUpdateController {

    private final PetUpdateService petUpdateService;

    @Autowired
    public PetUpdateController(PetUpdateService petUpdateService) {
        this.petUpdateService = petUpdateService;
    }

    // 펫 등록
    @PostMapping("/addPet")
    public PetTable addPet(@RequestBody PetTable pet) {
        return petUpdateService.createPet(pet);
    }

    @GetMapping
    public List<PetTable> getMyPets() {
        return petUpdateService.getPets();
    }

    // 펫 수정
    @PutMapping("/updatePet/{petCode}")
    public PetTable updatePet(@PathVariable int petCode, @RequestBody PetTable pet) {
        return petUpdateService.updatePet(petCode, pet);
    }

    // 펫 삭제
    @DeleteMapping("/deletePet/{petCode}")
    public void deletePet(@PathVariable int petCode) {
        petUpdateService.deletePet(petCode);
    }
}
