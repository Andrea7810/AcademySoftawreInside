package it.softwareInside.Esercizio3;

public class Carrozzeria {

	private String colore , tipoVernice , materiale;
	
	
	public Carrozzeria () {
		
		setColore("nera");
		setTipoVernice("lucido");
		setMateriale("fibra di carbonio");
	}
	
	
	public Carrozzeria (String colore , String tipoVernice, String materiale) {
		
		setColore(colore);
		setMateriale(materiale);
		setTipoVernice(tipoVernice);
	}
	
	
	
	@Override
	public String toString () {
		
		return "Colore: " + this.colore + " Tipo di vernice: " + this.tipoVernice + " Materiale: " + this.materiale;
	}
	
	
	
	
	
	//metodi set
	
	
	public void setColore (String colore) {
		
		this.colore = colore;
	}
	
	public void setTipoVernice (String tipoVernice) {
		
		this.tipoVernice = tipoVernice;
	}
	
	public void setMateriale (String materiale) {
		
		this.materiale = materiale;
	}
	
	
	//metoti get
	
	
	
	public String getColore () {
		
		return this.colore;
	}
	
	
	public String getTipoVernice () {
		
		return this.tipoVernice;
	}
	
	
	public String getMateriale () {
		
		return this.materiale;
	}
	
	
	
	
}
