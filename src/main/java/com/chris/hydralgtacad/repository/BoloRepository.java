package com.chris.hydralgtacad.repository;

import com.chris.hydralgtacad.entity.Bolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoloRepository extends JpaRepository<Bolo, Integer> {
    List<Bolo> findAll();
    String deleteByReason(String bolo);
    int deleteBoloById(int id);
}