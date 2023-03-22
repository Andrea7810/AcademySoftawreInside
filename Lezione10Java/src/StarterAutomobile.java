
public class StarterAutomobile {

	public static void main(String[] args) {

		
		Automobile automobile1 = new Automobile ();
		
		
//		automobile1.setMarca("Mercedes");
//		automobile1.setColore("Bianco");
//		automobile1.setCosto(45000);
//		automobile1.setVelocita(150);
	
		//usiamo un costrutto per inizializzare gli attributi dell'oggetto
		
		
		
		System.out.println("\n" + automobile1.toString());
		
		
		
		automobile1.setColore("giallo");
		
		System.out.println("\n" + automobile1);
		
		
		automobile1.setVelocita(160);
		
		System.out.println("\n" + automobile1);
		
		
		
		
		automobile1.frena();
		
		System.out.println("\n" + automobile1.getVelocita());
		
		
		automobile1.accellera();
		
		System.out.println(automobile1.getVelocita());
		
		
		
		
		Automobile automobile2 = new Automobile("Fiat", "Rosso", 13000, 120);
		
		System.out.println("\n" + automobile2);
		
		automobile2.setMarca("Ferrari");
		
		
		System.out.println("\n" + automobile2);
	}

}
