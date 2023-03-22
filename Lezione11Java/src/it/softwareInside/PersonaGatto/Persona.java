package it.softwareInside.PersonaGatto;

public class Persona {

	private String nome;
	private int eta;
	private Gatto gatto;
	
	
	public Persona () {
		
		setNome("Luca");
		setEta(30);
		setGatto(new Gatto());
	}
	
	
	public Persona (String nome, int eta , Gatto gatto) {
		
		setNome(nome);
		setEta(eta);
		setGatto(gatto);
	}
	
	
	
	
	
	@Override
	public String toString () {
		
		return "Nome: " + this.nome + " Eta: " + this.eta + " Gatto: " + this.gatto;
	}
	
	
	
	
	
	//metodi set
	
	public void setNome (String nome) {
		
		this.nome = nome;
	}
	
	
	public void setEta (int eta) {
		
		this.eta = eta;
	}
	
	public void setGatto (Gatto gatto) {
		
		this.gatto = gatto;
	}
	
	
	
	//metodi get
	
	
	public String getNome () {
		
		return this.nome;
	}
	
	
	public int getEta () {
		
		return this.eta;
	}
	
	public Gatto getGatto () {
		
		return this.gatto;
	}
	
}
