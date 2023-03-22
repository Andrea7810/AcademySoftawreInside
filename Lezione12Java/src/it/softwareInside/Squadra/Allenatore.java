package it.softwareInside.Squadra;

public class Allenatore {

	
	private String nome;
	private int anniDiEsperienza;
	
	
	
	public Allenatore (String nome , int anniDiEsperienza) {
		
		setAnniDiEsperienza(anniDiEsperienza);
		setNome(nome);
		
	}
	
	
	
	public Allenatore () {
		
		this("Mario", 15);
	}
	
	
	
	
	@Override
	public String toString () {
		
		return "Nome: " + this.nome + " Anni di esperienza: " + this.anniDiEsperienza;
	}
	
	
	
	
	
	//metodi set
	
	public void setNome (String nome) {
		
		this.nome = nome;
	}
	
	
	public void setAnniDiEsperienza (int anniDiEsperienza) {
		
		this.anniDiEsperienza = anniDiEsperienza;
	}
	
	
	
	
	
	//metodi get
	
	
	public String getNome () {
		
		return this.nome;
	}
	
	
	
	public int getaAnniDiEsperienza () {
		
		return this.anniDiEsperienza;
	}
	
}
