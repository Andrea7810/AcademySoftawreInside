package it.softwareInside.Cinema;

public class Film {

	
	private String nome ,  genere;
	private int etaMinima;
	
	
	public Film (String nome , String genere , int etaMinima) {
		
		setEtaMinima(etaMinima);
		setGenere(genere);
		setNome(nome);
		
	}
	
	
	
	public Film () {
		
		this("Avatar", "Fantasy", 14);
	}
	
	
	
	@Override
	public String toString () {
		
		return "Nome: " + this.nome + " Genere: " + this.genere + " Età minima: " + this.etaMinima;
	}
	
	
	
	
	
	
	//metodi set
	
	public void setNome (String nome) {
		
		this.nome = nome;
	}
	
	
	
	
	public void setGenere (String genere) {
		
		this.genere = genere;
	}
	
	
	
	
	
	public void setEtaMinima (int etaMinima) {
		
		
		if (etaMinima > 18)
			this.etaMinima = 18;
		else
			this.etaMinima = etaMinima;
	}
	
	
	
	
	//metodi get
	
	
	
	public String getNome () {
		
		return this.nome;
	}
	
	
	
	public String getGenere () {
		
		return this.genere;
	}
	
	
	
	public int getEtaMinima () {
		
		return this.etaMinima;
	}
	
	
}
