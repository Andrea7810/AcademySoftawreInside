package it.softwareInside.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.app.model.Team;
import it.softwareInside.app.repository.TeamRepository;
import jakarta.validation.Valid;

@Service
public class TeamService {

	
	@Autowired
	TeamRepository teamRepository;
	
	
	
	
	public boolean addTeam (@Valid Team team) {
		
		try {
			
			teamRepository.save(team);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	
	public boolean removeAll () {
		
		try {
			
			teamRepository.deleteAll();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public Team removeById (String id) {
		
		try {
			
			Team t = teamRepository.findById(id).get();
			teamRepository.deleteById(id);
			return t;
			
		} catch (Exception e) {
			return null;
		}
	}
	
	
	
	
	
	public Team getById (String id) {
		
		try {
			
			return teamRepository.findById(id).get();
			
		} catch (Exception e) {
			return null;
		}
	} 
	
	
	
	public Iterable<Team> getAll () {
		
		try {
			
			return teamRepository.findAll();
			
		} catch (Exception e) {
			return null;
		}
	}
	
	
	
	
	
}
