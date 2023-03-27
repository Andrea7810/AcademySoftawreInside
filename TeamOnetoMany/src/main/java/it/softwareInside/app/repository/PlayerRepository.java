package it.softwareInside.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.softwareInside.app.model.Player;

public interface PlayerRepository extends JpaRepository<Player, String>{

}
