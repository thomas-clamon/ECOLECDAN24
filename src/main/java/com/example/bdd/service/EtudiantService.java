package com.example.bdd.service;

import com.example.bdd.dto.InEtudiantDto;
import com.example.bdd.dto.OutEtudiantDto;
import com.example.bdd.entities.EtudiantEntity;

import java.util.List;

public interface EtudiantService {

    OutEtudiantDto toDto(EtudiantEntity entity);

    EtudiantEntity getEntity(Integer id);

    Integer add (InEtudiantDto dto);

    Boolean delete(Integer id);

    Boolean exist(Integer id);

    List<OutEtudiantDto> getAll();

}
