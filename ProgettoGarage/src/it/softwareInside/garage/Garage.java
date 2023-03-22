package it.softwareInside.garage;

import it.softwareInside.veicoli.VeicoloAMotore;

public class Garage {

	private final int DIMENSIONE_GARAGE = 15;
	private VeicoloAMotore [] veicoliAMotore;
	
	
	
	
	public Garage () {
		
		setVeicoloAMotore(new VeicoloAMotore [DIMENSIONE_GARAGE]);
	}
	
	
	@Override
	public String toString () {
		
		String ris = "";
		
		for (int i = 0; i < veicoliAMotore.length; i++) {
			ris += "\n" + veicoliAMotore[i];
		}
		
		
		return "Veicoli a motore presenti nel garage: " + "\n" + ris;
		
	}
	
	
	
	//metodi di set
	
	public void setVeicoloAMotore (VeicoloAMotore [] veicoloAMotore) {
		
		this.veicoliAMotore = veicoloAMotore;
	}
	
	
	
	//metodi di get
	
	public VeicoloAMotore [] getVeicoloAMotore () {
		
		return this.veicoliAMotore;
	}
	
	
	
	
	
	//altri metodi
	
	
	
	public VeicoloAMotore rimuoviVeicolo (int posizione) {
		
		if (posizione < 0 || posizione >= veicoliAMotore.length)
			return null;
		
		VeicoloAMotore veicoloTmp = veicoliAMotore[posizione];
		veicoliAMotore[posizione] = null;
		return veicoloTmp;
		
	}
	
	
	
	
	public int aggiungiVeicolo (VeicoloAMotore veicoloAMotore) {
		
		if (veicoloAMotore == null) 
			return -1;
	
		
		for (int i = 0; i < veicoliAMotore.length; i++) {
			if (veicoliAMotore[i] == null) {
				veicoliAMotore[i] = veicoloAMotore;
				return i;
				
			}
			
		}
		return -1;
	}
	
	
	
}
