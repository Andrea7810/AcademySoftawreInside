package it.softwareInside.Squadra;

public class Player {

	
	private String nome, ruolo;
	private int eta;
	
	public Player (String nome, String ruolo , int eta) {
		
		setEta(eta);
		setNome(nome);
		setRuolo(ruolo);
	}
	
	
	public Player () {
		
		this("Carlo", "Attaccante", 23);
	}
	
	
	
	@Override
	public String toString () {
		
		return "Nome: " + this.nome + " Età: " + this.eta + " Ruolo: " + this.ruolo;
	}
	
	
	
	
	
	//metodi set
	
	public void setNome (String nome) {
		
		this.nome = nome;
	}
	
	
	public void setRuolo (String ruolo) {
		
		this.ruolo = ruolo;
	}
	
	
	public void setEta (int eta) {
		
		this.eta = eta;
	}
	
	
	
	
	
	//metodi get
	
	
	public int getEta () {
		
		return this.eta;
	}
	
	
	public String getNome () {
		
		return this.nome;
	
	}
	
	
	
	public String getRuolo ()  {
		
		return this.ruolo;
	}
	
	
}
