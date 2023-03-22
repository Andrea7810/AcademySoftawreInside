package it.softwareInside.veicoli;

public class Motocicletta extends VeicoloAMotore {

	
	private String tipologia;
	private int numTempiMotore;
	
	
	public Motocicletta (String tipologia , int numTempiMotore , String marca, String tipoAlimentazione , int annoDiImmatricolazione , int cilindrata) {
		
		super(marca, tipoAlimentazione, annoDiImmatricolazione, cilindrata);
		setTipologia(tipologia);
		setNumTempiMotore(numTempiMotore);
	}
	
	
	public Motocicletta () {
		
		this("Cross", 2, "Yamaha", "Benzina", 2018, 1200);
	}
	
	
	@Override
	public String toString () {
		
		return super.toString() + " Tipologia: " + this.tipologia + " Numero tempi motore: " + this.numTempiMotore;
	}
	
	
	
	
	//metodi di set
	
	
	public void setTipologia (String tipologia) {
		
		this.tipologia = tipologia;
	}
	
	
	public void setNumTempiMotore (int numTempiMotore) {
		
		if (numTempiMotore != 2 || numTempiMotore != 4)
			this.numTempiMotore = 2;
		else
			this.numTempiMotore = numTempiMotore;
	}
	
	
	
	
	//metodi di get
	
	public String getTipologia () {
		
		return this.tipologia;
	}
	
	
	
	public int getNumTempiMotore () {
		
		return this.numTempiMotore;
	}
	
	
	
}
