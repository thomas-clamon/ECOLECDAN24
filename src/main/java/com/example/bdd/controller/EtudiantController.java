package com.example.bdd.controller;

import com.example.bdd.dto.InEtudiantDto;
import com.example.bdd.dto.OutEtudiantDto;
import com.example.bdd.entities.EtudiantEntity;
import com.example.bdd.repositories.EtudiantRepository;
import com.example.bdd.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Etudiant")
public class EtudiantController {

    @Autowired
    private EtudiantService service;
    @GetMapping("test")
    public String hello(){
        return "Tout est OK";
    }

    @GetMapping("get/{id}")
    public OutEtudiantDto get(@PathVariable String id){
        Integer ID = Integer.parseInt(id);
        EtudiantEntity entity = service.getEntity(ID);
        return service.toDto(entity);

    }

    @PostMapping("add")
    public ResponseEntity ajouter (@RequestBody InEtudiantDto dto){

        Integer ID = service.add(dto);
        return new ResponseEntity("L'etudiant a ete ajouté avec l'id" + ID, HttpStatusCode.valueOf(200));
    }

}
