import java.util.ArrayList;

public class Nave {

	
	
	private final int DIMENSIONE_NAVE = 20;
	
	private String nome;
	private int numAnniRichiesti;
	private String codiceDiImbarco;
	private ArrayList<Persona> personeABordo;
	
	
	public Nave (String nome , int numAnniRichiesti , String codiceDiImbarco ) {
		
		setCodiceDiImbarco(codiceDiImbarco);
		setNome(nome);
		setNumAnniRichiesti(numAnniRichiesti);
		setPersona(new ArrayList<>(DIMENSIONE_NAVE));
	}
	
	public Nave () {
		
		this("Concordia", 5, "A715");
	}
	
	
	
	@Override
	public String toString () {
		
		
		return "Nome nave: " + this.nome + " Anni richiesti per capitano: " + this.numAnniRichiesti + " Codice di Imbarco: " + this.codiceDiImbarco + " Persone a bordo: " + this.personeABordo;
	}
	
	
	

	
	
	//metodi di set
	
	public void setNome (String nome) {
		
		this.nome = nome;
	}
	
	
	public void setNumAnniRichiesti (int numAnniRichiesti) {
		
		this.numAnniRichiesti = numAnniRichiesti;
	}
	
	
	
	public void setCodiceDiImbarco (String codiceDiImbarco) {
		
		this.codiceDiImbarco = codiceDiImbarco;
	}
	
	
	public void setPersona (ArrayList<Persona> persone) {
		
		this.personeABordo = persone;
	}
	
	
	
	//metodi di get
	
	public String getNome () {
		
		return this.nome;
	}
	
	
	public int getNumAnniRichiesti () {
		
		return this.numAnniRichiesti;
	}
	
	
	public String getCodiceDiImbarco () {
		
		return this.codiceDiImbarco;
	}
	
	
	public ArrayList<Persona> getPersone () {
		
		return this.personeABordo;
	}
	
	
	
	//altri metodi
	
	
	public void stampaNave () {
		
		System.out.println("NOME: " + this.nome);
		System.out.println("ANNI RICHIESTI: " + this.numAnniRichiesti);
		System.out.println("CODICE DI IMBARCO: " + this.codiceDiImbarco);
		
		System.out.println("Persone a Bordo: ");
		
		for (Persona p : personeABordo)
			System.out.println(p);
		
	}
	
	
	
	public boolean addPasseggero (Persona persona) {
		
		if (persona == null)
			return false;
		
		if (! (persona instanceof Passeggero))
			return false;
		
		if (   !  ( ((Passeggero) persona).getCartaDiImbarco().equals(getCodiceDiImbarco()) )    )
			return false;

		
		if ( personeABordo.size() + 2 < DIMENSIONE_NAVE) { //lasciamo 2 posti liberi per personale di bordo e capitano
			personeABordo.add(persona);
			return true;
			
		}
		
		return false;
	}
	
	
	
	
	
	public boolean addCapitano (Capitano capitano) {
		
		if (capitano == null || isCapitanoOnBoard()) 
			return false;
		
		
		
		if (personeABordo.size() < DIMENSIONE_NAVE && capitano.getExp() >= getNumAnniRichiesti()) {
			personeABordo.add(capitano);
			return true;
		}
			
				
		return false;
	}
	
	
	
	public boolean isCapitanoOnBoard () {
		
		for (Persona p : personeABordo) {
			
			if ( p instanceof Capitano)
				return true;
		}
		return false;
	}
	
	
	
	
	public boolean addPersonaleDiBordo (PersonaleDiBordo personaleDiBordo) {
		
		if (personaleDiBordo == null)
			return false;
		
		if (personeABordo.size() < DIMENSIONE_NAVE && ! isPersonaleDiBordoOnArray()) {
			personeABordo.add(personaleDiBordo);
			return true;
		}
		
		return true;
	}
	
	
	

	public boolean isPersonaleDiBordoOnArray () {
		
		for ( Persona p : personeABordo) {
			
			if ( p instanceof PersonaleDiBordo)
				return true;
		}
		
		return false;
	}
	
	
	
	public void removeAll () {
		
		personeABordo.clear();
	}
	
	
	public Persona removePersona (Persona persona) {
		
		if ( persona == null)
			return null;
		
		
		 if ( personeABordo.remove(persona))
			 return persona;
		 
		 return null;
	}
	
}
