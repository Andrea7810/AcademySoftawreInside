package it.softwareInside.veicoli;

public class VeicoloAMotore {
	
	
	private int annoDiImmatricolazione , cilindrata;
	private String marca , tipoAlimentazione;
	
	
	public VeicoloAMotore () {
		this("Peugeout", "Diesel", 2015, 1300);
	}
	
	
	public VeicoloAMotore (String marca, String tipoAlimentazione , int annoDiImmatricolazione , int cilindrata) {
		
		setAnnoDiImmatricolazione(annoDiImmatricolazione);
		setCilindrata(cilindrata);
		setMarca(marca);
		setTipoDiAlimentazione(tipoAlimentazione);
	}
	
	
	@Override
	public String toString () {
		
		return "Marca: " + this.marca + " Tipo di Alimentazione: " + this.tipoAlimentazione + " Anno di Immatricolazione: " + this.annoDiImmatricolazione + " Cilindrata: " + this.cilindrata;
	}
	
	
	
	
	//metodi set
	
	public void setAnnoDiImmatricolazione (int annoDiImmatricolazione) {
		
		if (annoDiImmatricolazione < 1980 || annoDiImmatricolazione > 2023)
			this.annoDiImmatricolazione = 2010;
		else
			this.annoDiImmatricolazione = annoDiImmatricolazione;
	}
	
	
	public void setCilindrata (int cilindrata) {
		
		if (cilindrata < 1000 || cilindrata > 5000)
			this.cilindrata = 1500;
		else
			this.cilindrata = cilindrata;
	}
	
	
	
	public void setMarca (String marca) {
		
		this.marca = marca;
	}
	
	
	
	public void setTipoDiAlimentazione (String tipoDiAlimentazione) {
		
		switch (tipoDiAlimentazione) {
		case "Benzina":
			this.tipoAlimentazione = tipoDiAlimentazione;
			break;
		case "Diesel":
			this.tipoAlimentazione = tipoDiAlimentazione;
			break;
		case "Metano":
			this.tipoAlimentazione = tipoDiAlimentazione;
			break;
		case "Elettrica":
			this.tipoAlimentazione = tipoDiAlimentazione;
			break;	
		default: this.tipoAlimentazione = "Benzina";
			break;
		}
		
		this.tipoAlimentazione = tipoDiAlimentazione;
	}
	
	
	
	
	
	//metodi get
	
	
	
	public int getAnnoDiImmatricolazione () {
		
		return this.annoDiImmatricolazione;
	}
	
	
	
	public int getCilindrata () {
		
		return this.cilindrata;
	}
	
	
	
	
	public String getMarca () {
		
		return this.marca;
	}
	
	
	
	public String getTipoDiAlimentazione () {
		
		return this.tipoAlimentazione;
	}
	
	
	
	
	
}
