package com.eudes.dslistbackend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.eudes.dslistbackend.entities.Game;
import com.eudes.dslistbackend.projections.GameMinProjection;

public interface GameRepository extends JpaRepository<Game, Long> {

    @Query(nativeQuery = true, value = """
		SELECT game.id, game.title, game.game_year \"year\", game.img_url AS imgUrl,
		game.short_description AS shortDescription, belonging.position
        FROM game
        JOIN belonging ON game.id = belonging.game_id
        WHERE belonging.gamelist_id = :listId
        ORDER BY belonging.position
			""")
    List<GameMinProjection> searchByList(Long listId);
    
}
