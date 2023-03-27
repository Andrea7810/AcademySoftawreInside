package it.softwareInside.app.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Team {

	@Id
	private String nome;
	
	
	private int trofeiVinti;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "allenatore_id")
	private Allenatore allenatore;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "players_id")
	private Set<Player> players;
	
	
}
