package com.example.bdd.service;

import com.example.bdd.dto.OutEtudiantDto;
import com.example.bdd.entities.EtudiantEntity;

public interface EtudiantService {

    OutEtudiantDto toDto(EtudiantEntity entity);

    EtudiantEntity getEntity(Integer id);
}
