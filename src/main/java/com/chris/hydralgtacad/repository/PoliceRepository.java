package com.chris.hydralgtacad.repository;

import com.chris.hydralgtacad.entity.CadSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PoliceRepository extends JpaRepository<CadSystem, Integer> {
    List<CadSystem> findAll();

    List<CadSystem> findAllByPlayerName(String player_name);
}
