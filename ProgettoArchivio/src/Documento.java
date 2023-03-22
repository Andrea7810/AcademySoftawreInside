
public class Documento {

	
	
	private String testo;
	
	
	public Documento (String testo) {
		
		setTesto(testo);
	}
	
	
	public Documento () {
		this("AAAAAAAAAA");
	}
	
	
	@Override
	public String toString () {
		
		return "Testo --> " + this.testo;
	}
	
	
	
	
	
	//metodi set
	
	public void setTesto (String testo) {
		
		this.testo = testo;
	}
	
	
	
	
	//metodi get
	
	public String getTesto () {
		
		return this.testo;
	}
	
	
	
	//altri metodi
	
	
	
	public double calcolaQualita () {
		
		double qualita1 = 1 + testo.length();
		
		double qualita = 1 / qualita1;
		
		return qualita;
		
		
		
	}
	
	
	
	
	
	
}
