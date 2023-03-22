package it.softwareInside.Esercizio1;

public class Persona {

	
	private String nome;
	private int eta;
	
	
	public Persona (String nome , int eta) {
		
		setEta(eta);
		setNome(nome);
	}
	
	public Persona () {
		
		this("Mario", 25);
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
		
		if ( eta < 0 || eta > 100)
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
	
	
	
	//altri metodi
	
	public void saluta () {
		
		System.out.print("Ciao sono " + this.nome + " e ho " + this.eta + " anni.");
	}
	
}
