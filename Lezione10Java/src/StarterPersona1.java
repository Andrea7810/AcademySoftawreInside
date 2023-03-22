
public class StarterPersona1 {

	public static void main(String[] args) {

		Persona persona = new Persona();
		
		persona.setNome("Mario");
		
		persona.setCognome("Rossi");
		
		persona.setEta(55);
		
		
//		int eta = persona.getEta(); //se vuoi salvarti il dato in una variabile
		
		System.out.println(persona.getNome() + " " + persona.getCognome() + " " + persona.getEta());
		
		//CREIAMO UN ALTRA PERSONA
		
		Persona persona2 = new Persona();
		
		persona2.setNome("Luigi");
		
		persona2.setCognome("Bianchi");
		
		persona2.setEta(25);
		
		
		//stampiamo a video la persona con l'eta più grande
		
		System.out.println("Età maggiore");
		
		
		if (persona.getEta() > persona2.getEta())
			System.out.println(persona.getNome());
		else
			System.out.println(persona2.getNome());
		
		
		
		System.out.println("*******");
		System.out.println("Cognome più lungo");

		
		if (persona.getCognome().length() >= persona2.getCognome().length())
			System.out.println(persona.getCognome());
		else
			System.out.println(persona2.getCognome());
		
	}

}
