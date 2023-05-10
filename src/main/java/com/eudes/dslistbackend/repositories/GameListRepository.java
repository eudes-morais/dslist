package com.eudes.dslistbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eudes.dslistbackend.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
