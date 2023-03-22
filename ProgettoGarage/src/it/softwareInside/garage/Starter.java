package it.softwareInside.garage;

import it.softwareInside.veicoli.Furgone;
import it.softwareInside.veicoli.Motocicletta;
import it.softwareInside.veicoli.VeicoloAMotore;

public class Starter {

	public static void main(String[] args) {

		
		Garage garage1 = new Garage();
		
		
		garage1.aggiungiVeicolo(new VeicoloAMotore());
		
		
		garage1.aggiungiVeicolo(new Furgone(800, "Mercedes", "Diesel", 2005, 1300));
		
		System.out.println( garage1 );
		
		System.out.println("###################");
		
		System.out.println( garage1.aggiungiVeicolo(new Motocicletta()));
		
		System.out.println(garage1);
	}

}
