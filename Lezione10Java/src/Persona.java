
public class Persona {

	
	//ATTRIBUTI DELLA CLASSE
	
	private String nome; //il private è un modficatore di accesso
	private String cognome;
	private int eta;
	
	
	//METODI DI GETTING
	
	public String getNome() {
		
		return this.nome;
	}
	
	
	public String getCognome () {
		
		return this.cognome;
	}
	
	
	public int getEta () {
		
		return this.eta;
	}
	
	
	
	
	
	
	//METODI DI SETTING
	
	public void setNome (String nome) {
		
		this.nome = nome;
		
	}
	
	
	public void setCognome (String cognome) {
		
		this.cognome = cognome;
		
	}
	
	
	
	
	public void setEta(int eta) {
		
		if (eta > 0)
		     this.eta = eta;
		else 
		     this.eta = - eta; //eta = - (-20) ==> 20
	}
	
	
	
	//METODI O FUNZIONI DELLA CLASSE
	
	/**
	 * semplice metodo che stampa a video il nome
	 * della persona.
	 * 
	 */
	public void  saluta () {  		//void significa che ritorna nulla

		System.out.println("Ciao mi chiamo " + nome + " età " + eta + " " + cognome);
	}
	
	
	
	
	
}
