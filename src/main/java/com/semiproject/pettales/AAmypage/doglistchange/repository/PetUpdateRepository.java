package com.semiproject.pettales.AAmypage.doglistchange.repository;

import com.semiproject.pettales.AAmypage.doglistchange.entity.PetTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetUpdateRepository extends JpaRepository<PetTable, Integer> {
}