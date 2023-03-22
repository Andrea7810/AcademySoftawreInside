
public class DocumentoPrioritario extends Documento {

	
	
	private int incremento;
	
	public DocumentoPrioritario (String testo , int incremento) {
		
		super(testo);
		setIncremento(incremento);
		
	}
	
	public DocumentoPrioritario () {
		
		this("SPECIAL", 5);
	}
	
	
	@Override
	public String toString () {
		
		return super.toString() + " incremento di: " + this.incremento;
	}
	
	
	
	
	//metodi di set
	
	public void setIncremento (int incremento) {
		
		this.incremento = incremento;
	}
	
	
	
	//metodi di get
	
	public int getIncremento () {
		
		return this.incremento;
	}
	
	
	
	//altri metodi
	
	@Override
	public double calcolaQualita () {
		
		return super.calcolaQualita() + incremento;
	}
	
	
}
