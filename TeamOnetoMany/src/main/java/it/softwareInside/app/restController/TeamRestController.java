package it.softwareInside.app.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.softwareInside.app.model.Team;
import it.softwareInside.app.service.TeamService;

@RequestMapping("/api")
@RestController
public class TeamRestController {

	
	
	@Autowired
	TeamService teamService;
	
	
	@PostMapping("/add-team")
	public boolean addTeam (@RequestBody Team team) {
		
		return teamService.addTeam(team);
	}
	
	
	
	
	@DeleteMapping("/delete-all")
	public boolean removeAll () {
		
		return teamService.removeAll();
	}
	
	
	
	
	@DeleteMapping("/delete-by-id")
	public Team removeById (@RequestParam (name = "id") String id) {
		
		return teamService.removeById(id);
	}
	
	
	
	@GetMapping("/get-by-id")
	public Team getById (@RequestParam (name = "id") String id) {
		
		return teamService.getById(id);
	}
	
	
	
	@GetMapping("/get-all")
	public Iterable<Team> getAll () {
		
		return teamService.getAll();
	}
	
	
	
	
}
