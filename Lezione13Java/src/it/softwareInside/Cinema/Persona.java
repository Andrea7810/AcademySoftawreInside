package it.softwareInside.Cinema;

public class Persona {

	private String nome;
	private int eta;
	
	
	public Persona (String nome , int eta) {
		
		setEta(eta);
		setNome(nome);
	}
	
	
	public Persona () {
		
		this("Mario", 30);
	}
	
	
	
	@Override
	public String toString () {
		
		return "Nome: " + this.nome + " Età: " + this.eta;
	}
	
	
	
	
	
	
	
	//metodi di set
	
	
	public void setNome (String nome) {
		
		this.nome = nome;
	}

	
	
	
	public void setEta (int eta) {
		
		if (eta < 0 || eta > 110)
			this.eta = 20;
		else
			this.eta = eta;
	}
	
	
	
	
	//metodi di get
	
	
	
	public String getNome () {
		
		return this.nome;
	}
	
	
	public int getEta () {
		
		return this.eta;
	}
	
	
	
	
}
