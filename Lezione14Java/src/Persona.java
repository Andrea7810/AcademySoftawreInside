
public class Persona {

	
	private String nome;
	private int eta;
	
	
	public Persona () {
		
		
		this("Luca", 13);
	}
	
	
	public Persona (String nome , int eta) {
		
		setEta(eta);
		setNome(nome);
	}
	
	
	@Override
	public String toString () {
		
		return "Nome: " + this.nome + " età: " + this.eta;
	}
	
	
	
	
	
	
	
	//metodi set
	
	public void setNome (String nome) {
		
		this.nome = nome;
	}
	
	
	
	public void setEta (int eta) {
		
		this.eta = eta;
	}
	
	
	
	//metodi get
	
	
	
	public String getNome () {
		
		return this.nome;
	}
	
	
	public int getEta () {
		
		return this.eta;
	}
	
	
	
	//altro metodo
	
	public void saluta () {
		
		System.out.println("Ciao mi chiamo " + this.nome + " e ho " + this.eta + " anni.");
		
	}
	
	
	
	
	
	
	
}
