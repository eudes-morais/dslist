package com.eudes.dslistbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eudes.dslistbackend.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
