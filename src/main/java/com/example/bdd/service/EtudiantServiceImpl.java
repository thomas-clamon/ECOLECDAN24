package com.example.bdd.service;

import com.example.bdd.dto.OutEtudiantDto;
import com.example.bdd.entities.EtudiantEntity;
import com.example.bdd.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class EtudiantServiceImpl implements EtudiantService{

    @Autowired
    private EtudiantRepository repository;

    @Override
    public OutEtudiantDto toDto(EtudiantEntity entity) {
        OutEtudiantDto dto = new OutEtudiantDto();
        dto.setDisplayName(entity.getPrenom() + " " +entity.getNom());
        dto.setAge(Period.between(entity.getBirth_date(), LocalDate.now()).getYears());
        return dto;
    }

    @Override
    public EtudiantEntity getEntity(Integer id) {
        return repository.findById(id).get();
    }
}
