package it.softwareInside.Cinema;

public class Cinema {

	private String nome;
	private Film [] films;
	private Persona [] persone;
	
	
	public Cinema (String nome) {
		
		setNome(nome);
		setFilm(new Film [5]);
		setPersona(new Persona [10]);
	}
	
	
	
	public Cinema () {
		
		this("The Space");
	}
	
	
	
	@Override
	public String toString () {
		
		String risFilms = "";
		
		for (int i = 0; i < films.length; i++) {
			risFilms += "\n" + films[i];
		}
		
		
		String risPersone = "";
		
		for (int i = 0; i < persone.length; i++) {
			risPersone += "\n" + persone[i];
		}
		
		
		
		return "Nome cinema: " + this.nome + " Film disponibili: " + risFilms + "\nPersone nel cinema: " + risPersone;
	}
	
	
	
	
	
	
	
	
	
	
	//metodi di set
	
	
	public void setNome (String nome) {
		
		this.nome = nome;
	}
	
	
	public void setFilm (Film [] films) {
		
		this.films = films;
	}
	
	
	
	public void setPersona (Persona [] persone) {
		
		this.persone = persone;
	}
	
	
	
	//metodi di get
	
	
	public String getNome () {
		
		return this.nome;
	}
	
	
	
	public Film [] getFilm () {
		
		return this.films;
	}
	
	
	
	public Persona [] getPersona () {
		
		return this.persone;
	}
	
	
	
	
	
	//altre funzioni
	
	
	
	public boolean addFilm (Film film) {
		
		if (film == null)
			return false;
		
		for (int i = 0; i < films.length; i++) {
			if (films[i] == null) {
				films[i] = film;
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
	public Film removeFilm (int posizione) {
		
		if (posizione < 0 || posizione >= films.length)
			return null;
		
		Film filmRimosso = new Film ();
		
		filmRimosso = films[posizione];
		films[posizione] = null;
		return filmRimosso;
		
	}
	
	
	public void stampaFilmDisponibili () {
		
		for (int i = 0; i < films.length; i++) {
			System.out.println(films[i]);
		}
	}
	
	
	
	public void stampaPersone () {
		
		for (int i = 0; i < persone.length; i++) {
			System.out.println(persone[i]);
		}
	}
	
	
	
	
	public void removeAllPeople () {
		
		for (int i = 0; i < persone.length; i++) {
			persone[i] = null;
		}
	}
	
	
	
	
	
	
	
	
	
	public boolean addPersonaToFilm (Persona persona , Film film) {
		
		if (persona == null || film == null)
			return false;
		
		
	
		for (int i = 0; i < persone.length; i++) {
			
			if (persone[i] == null && persona.getEta() >= film.getEtaMinima()) {
				
				persone[i] = persona;
				return true;
				
			}
				
		}
		
		return false;
	}
	
	
	
}
