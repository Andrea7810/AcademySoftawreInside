import java.util.ArrayList;

import lombok.Data;


@Data
public class Coda {

	
	ArrayList<Persona> personeInCoda;
	
	
	
	public Coda () {
		setPersoneInCoda(new ArrayList<Persona>());
	}
		
	
	
	
	
	public boolean aggiungiPersona (Persona p) {
		
		if ( p == null)
			return false;
		
		personeInCoda.add(personeInCoda.size() , p);
		return true;
	}
	
	
	
	
	public Persona restituisciProssimo () {
		
		Persona p = personeInCoda.get(0);
		personeInCoda.remove(0);
		
		
		return p;
	}
}
