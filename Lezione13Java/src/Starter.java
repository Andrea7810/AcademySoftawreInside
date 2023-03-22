
public class Starter {

	public static void main(String[] args) {

		
		Animale animale1 = new Animale();
		
		System.out.println(animale1);
		
		
		animale1.setEta(40);
		
		System.out.println(animale1);
		
		
		animale1.setEta(5);
		animale1.setSesso('G');
		animale1.setSpecie("Elefante");
		
		System.out.println(animale1);
		
		
		animale1.setSesso('F');
		
		System.out.println(animale1);
		
		System.out.println("\n\n######################1");
		
		
		Zoo zoo1 = new Zoo();
		
		System.out.println(zoo1);
		
		
		System.out.println("\n\n#######################2");
		
		
		
		zoo1.aggiungiAnimale(animale1);
		zoo1.aggiungiAnimale(new Animale("Giraffa", 'F', 13));
		zoo1.aggiungiAnimale(new Animale());
		
		
		System.out.println("L'animale rimosso è " + zoo1.rimuoviAnimale(1) + "\n");
		
		System.out.println(zoo1);
		
		
		System.out.println("\n\n########################3");
		
		zoo1.rimuoviAnimale(0);
		zoo1.rimuoviAnimale(2);
		
		zoo1.aggiungiAnimale(new Animale("Leone", 'M', 7));
		zoo1.aggiungiAnimale(new Animale());
		
		zoo1.aggiungiAnimale(new Animale("Leone", 'M', 10));
		zoo1.aggiungiAnimale(new Animale("Leone", 'M', 10));
		zoo1.aggiungiAnimale(new Animale("Leone", 'M', 10));

		zoo1.aggiungiAnimale(new Animale("Canguro", 'F', 12));
		
		
		

		
		
		System.out.println(zoo1);
		
	}

}
