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
public class Allenatore {

	@Size(min = 5 , max = 5)
	@Id
	private String codFiscale;
	
	@NotEmpty
	@NotNull
	private String cognome;
	
	
	@Min(30)
	@Max(60)
	private int eta;
	
	
	
	
	
}
