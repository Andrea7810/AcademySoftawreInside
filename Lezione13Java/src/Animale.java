
public class Animale {

	
	private String specie;
	private char sesso;
	private int eta;
	
	
	public Animale (String specie , char sesso , int eta) {
		
		setEta(eta);
		setSesso(sesso);
		setSpecie(specie);
	}
	
	
	public Animale () {
		
		this("Canguro", 'M', 10);
	}
	
	
	
	
	
	@Override
	public String toString () {
		
		return "Specie: " + this.specie + " Sesso: " + this.sesso + " Età: " + this.eta;
	}
	
	
	
	
	
	//metodi set
	
	
	public void setSpecie (String specie) {
		
		this.specie = specie;
	}
	
	
	
	
	public void setSesso (char sesso) {
		
		switch (sesso) {
		case 'M':
			this.sesso = sesso;
			break;

		case 'F':
			this.sesso = sesso;
			break;
			
		default: this.sesso = 'M';
			break;
		}
		
	}
	
	
	
	
	public void setEta (int eta) {
		
		if (eta <= 0 || eta > 30)
			this.eta = 1;
		else
			this.eta = eta;
	}
	
	
	
	//metodi get
	
	
	public String getSpecie () {
		
		return this.specie;
	}
	
	
	
	public int getEta () {
		
		return this.eta;
	}
	
	
	
	public char getSesso () {
		
		return this.sesso;
	}
	
	
	
}
