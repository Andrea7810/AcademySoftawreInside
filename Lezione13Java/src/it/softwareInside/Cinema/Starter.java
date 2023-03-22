package it.softwareInside.Cinema;

public class Starter {

	public static void main(String[] args) {

		
		Cinema cinema1 = new Cinema();
		
		
		
		
		cinema1.addFilm(new Film());
		
		cinema1.removeFilm(0);
		
	//	System.out.println(cinema1);
		
		
		
		cinema1.addFilm(new Film());
		cinema1.addFilm(new Film());
		cinema1.addFilm(new Film());
		cinema1.addFilm(new Film());
		
		Film film1 = new Film();
		
		cinema1.addFilm(film1);
		
		cinema1.addPersonaToFilm(new Persona("Luca", 16), film1);
		
	//	cinema1.removeAllPeople();
		
		System.out.println(cinema1);
	}

}
