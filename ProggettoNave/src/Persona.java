
public class Persona {

	
	private String nome;
	private int eta;
	
	
	public Persona (String nome , int eta) {
		
		setEta(eta);
		setNome(nome);
	}
	
	public Persona () {
		
		this("Mario", 20);
	}
	
	
	@Override
	public String toString () {
		
		return "Nome: " + this.nome + " Età: " + this.eta;
	}
	
	
	
	
	
	
	//metodi set
	
	public void setNome (String nome) {
		
		this.nome = nome;
	}
	
	
	public void setEta (int eta) {
		
		this.eta = eta;
	}
	
	
	//metodi di get
	
	
	public int getEta () {
		
		return this.eta;
	}
	
	public String getNome () {
		
		return this.nome;
	}
	
	
	
}
