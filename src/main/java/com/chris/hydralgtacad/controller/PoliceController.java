package com.chris.hydralgtacad.controller;

import com.chris.hydralgtacad.entity.Bolo;
import com.chris.hydralgtacad.entity.CadSystem;
import com.chris.hydralgtacad.repository.BoloRepository;
import com.chris.hydralgtacad.repository.PoliceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@CrossOrigin
@Transactional
public class PoliceController {

    private PoliceRepository policeRepository;
    private BoloRepository boloRepository;



    @Autowired
    public PoliceController(PoliceRepository policeRepository, BoloRepository boloRepository){
        this.policeRepository = policeRepository;
        this.boloRepository = boloRepository;
    }

    @GetMapping("/citizens-record/{player_name}")
    public List<CadSystem> information(@PathVariable String player_name) {
        return policeRepository.findAllByPlayerName(player_name);
    }

    @GetMapping("/all-arrests")
    public List<CadSystem> showArrests(){
        return policeRepository.findAll();
    }

    @GetMapping("/all-bolos")
    public List<Bolo> showBolos(){
        return boloRepository.findAll();
    }

    @GetMapping("delete-bolo/{bolo}")
    public void deleteBolosByBolo(@PathVariable String bolo) {
        boloRepository.deleteByReason(bolo);
    }

    @PostMapping("/insert-bolo")
    public Bolo createBolo(@RequestBody Bolo insertBolo){
        return boloRepository.save(insertBolo);
    }

    @PostMapping("/delete-bolos")
    public void deleteBolo(@RequestBody List<Bolo> bolosForDelete){
        System.out.println(bolosForDelete);
        for(int i = 0; i<bolosForDelete.size(); i++){
            boloRepository.deleteBoloById(bolosForDelete.get(i).getId());
        }
    }
}
