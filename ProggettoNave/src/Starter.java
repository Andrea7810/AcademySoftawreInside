
public class Starter {

	public static void main(String[] args) {

		
		Nave nave1 = new Nave();
		
		
		nave1.addPasseggero(new Passeggero("Luca", 29, "A715"));
		
		nave1.addPasseggero(new Passeggero("Mario", 30, "A715"));
		nave1.addPasseggero(new Passeggero("Franco", 54, "A715"));

		nave1.addCapitano(new Capitano());

		nave1.stampaNave();
	}

}
