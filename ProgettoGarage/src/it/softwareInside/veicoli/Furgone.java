package it.softwareInside.veicoli;

public class Furgone extends VeicoloAMotore {

	
	private int capacitaCarico;
	
	
	
	public Furgone () {
		
		super();
		setCapacitaCarico(1000);
	}
	
	
	
	public Furgone (int capacitaCarico , String marca, String tipoAlimentazione , int annoDiImmatricolazione , int cilindrata) {
		
		super(marca, tipoAlimentazione, annoDiImmatricolazione, cilindrata);
		setCapacitaCarico(capacitaCarico);
	}
	
	
	
	@Override
	public String toString () {
		
		return super.toString() + " Capacità di carico: " + this.capacitaCarico;
	}
	
	
	
	
	
	//metodi set
	
	public void setCapacitaCarico (int capacitaCarico) {
		
		if (capacitaCarico < 600 || capacitaCarico > 1500) 
			this.capacitaCarico = 1000;
		else
			this.capacitaCarico = capacitaCarico;
	}
	
	
	//metodi get
	
	public int getCapacitaCarico () {
		
		return this.capacitaCarico;
	}
	
	
	
	
}
