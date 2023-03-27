package it.softwareInside.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.softwareInside.app.model.Team;

public interface TeamRepository extends JpaRepository<Team, String>{

}
