package it.softwareInside.PersonaGatto;

public class Gatto {

	private String nome , colore;
	private int eta;
	
	
	
	public Gatto (){
		
		setNome("Zeus");
		setColore("Marrone");
		setEta(5);
		
	}
	
	
	public Gatto (String nome , String colore , int eta) {
		
		setNome(nome);
		setColore(colore);
		setEta(eta);
	}
	
	
	
	
	
	
	@Override
	public String toString () {
		
		return "Nome: " + this.nome + " Colore: " + this.colore + " Età: " + this.eta;
	}
	
	
	
	
	
	
	
	//metodi set
	
	
	public void setNome (String nome) {
		
		this.nome = nome;
	}
	
	
	
	public void setColore (String colore) {
		
		this.colore = colore;
	}
	
	
	public void setEta (int eta) {
		
		this.eta = eta;
	}
	
	
	
	
	
	//metodi get
	
	
	public String getNome () {
		return this.nome;
	}
	
	
	public String getColore () {
		return this.colore;
	}
	
	
	public int getEt () {
		return this.eta;
	}
	
	
	
}
