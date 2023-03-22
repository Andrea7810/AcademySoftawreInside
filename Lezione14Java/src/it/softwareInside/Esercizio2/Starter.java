package it.softwareInside.Esercizio2;

public class Starter {

	public static void main(String[] args) {

		
		Zoo zoo1 = new Zoo ();
		
		zoo1.aggiungiAnimale(new Leone());
		zoo1.aggiungiAnimale(new Pinguino());
		zoo1.aggiungiAnimale(new Scimmia());
		zoo1.aggiungiAnimale(new Pinguino());
		zoo1.aggiungiAnimale(new Leone());
		zoo1.aggiungiAnimale(new Scimmia());

		
		
		System.out.println(zoo1);
		
		System.out.println("####################");
		
		zoo1.stampaAnimali();
		
		System.out.println( zoo1.removeAnimale(1));
		
		
	}

}
