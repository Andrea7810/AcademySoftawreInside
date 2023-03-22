package it.softwareInside.VettoreDiClassi;

public class Scaffale {

	private Bevanda[] bevande;

	
	
	public Scaffale (int dim) {
		setBevande(new Bevanda [dim]);
		
	}
	
	
	public  Scaffale () {
		
		this(3);
	}

	
	//metodi set
	
	public void setBevande (Bevanda [] bevande) {
		
		this.bevande = bevande;
	}
	
	
	//metodi get
	
	public Bevanda[] getBevande () {
		
		return this.bevande;
	}
	
	
	
	//altri metodi
	
	
	
	public void stampaScaffale () {
		
		for (int i = 0; i < bevande.length; i++) {
			System.out.println(this.bevande[i]);
		}
	}
	
	
	
	
	
	
	public boolean addBevanda (Bevanda bevanda) {
		
		for (int i = 0; i < bevande.length; i++) {
			
			if (bevande[i] == null) {
				
			bevande[i] = bevanda;
			return true;
			}
		}
	
	return false;
	}

	
	
	
	public Bevanda remBevanda (int posizione) {
		
		if (posizione < 0 || posizione >= this.bevande.length)
			return null;
		
		Bevanda bevanda = this.bevande[posizione];
		
		this.bevande[posizione] = null;
		
		return bevanda;
		
		
	}
	
	

	
	
}