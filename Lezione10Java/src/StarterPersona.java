import java.util.Random;

public class StarterPersona {

	public static void main(String[] args) {

	//	Random casuale = new Random();
		
		Persona persona1 = new Persona ();
		
		
		
	//	persona1.nome = "Paolo";
	//	persona1.nome += " claudio"; //per mantenere pure il vecchio valore
		
		//persona1.eta = casuale.nextInt(18, 41);
		
		
		persona1.setNome("Gigino");
		
		
		persona1.setEta(-20);
		
		persona1.setCognome("Calo");
		
		
		persona1.saluta();
		
		
		
	}

}
