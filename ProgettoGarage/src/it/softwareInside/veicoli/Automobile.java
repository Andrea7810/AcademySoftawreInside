package it.softwareInside.veicoli;

public class Automobile extends VeicoloAMotore {

	
	private int numPorte;
	
	
	public Automobile () {
		
		super();
		setNumPorte(5);
	}
	
	
	
	public Automobile (int numPorte , String marca, String tipoAlimentazione , int annoDiImmatricolazione , int cilindrata) {
		
		super(marca, tipoAlimentazione, annoDiImmatricolazione, cilindrata);
		setNumPorte(numPorte);
	}
	
	
	@Override
	public String toString () {
		
		return super.toString() + " Numero di Porte: " + this.numPorte;
	}
	
	
	
	
	
	
	
	//metodi di set
	
	public void setNumPorte (int numPorte) {
		
		if ( numPorte < 3 || numPorte > 7)
			this.numPorte = 5;
		else
			this.numPorte = numPorte;
	}
	
	
	//metodi di get
	
	
	public int getNumPorte () {
		
		return this.numPorte;
	}
	
	
	
	
	
	
}
