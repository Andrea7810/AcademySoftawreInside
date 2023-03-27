package it.softwareInside.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Player {

	@Size(min = 5 , max = 5)
	@Id
	private String codFiscale;
	
	@NotNull
	@NotEmpty
	private String cognome;
	
	@NotEmpty
	@NotNull
	private String ruolo;
	
	@Min(18)
	@Max(50)
	private int eta;
	
	
	
	
	
	
}
