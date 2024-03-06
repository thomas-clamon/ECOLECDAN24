package com.example.bdd.repositories;

import com.example.bdd.entities.EtudiantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends JpaRepository<EtudiantEntity, Integer> {
}
