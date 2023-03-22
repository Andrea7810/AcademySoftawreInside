
public class Studente extends Persona {

	
	private String materiaDiStudio;
	
	
	
	public Studente () {
		super(); //chiama il costruttore di default della classe Persona
		setMateriaDiStudio("Geografia");
	}
	
	
	public Studente ( String nome, int eta, String materiaDiStudio) {
		
		super(nome, eta);
		setMateriaDiStudio(materiaDiStudio);
	}
	
	
	@Override
	public String toString () {
		
		return super.toString() + " Materia di Studio: " + this.materiaDiStudio;	
	}
	
	
	
	
	//metodi di set
	
	public void setMateriaDiStudio (String materiaDiStudio) {
		
		this.materiaDiStudio = materiaDiStudio;
	}
	
	
	
	
	//metodi di get
	
	
	public String getMateriaDiStudio () {
		
		return this.materiaDiStudio;
	}
	
	
	
	
	
	//altri metodi
	
	@Override
	public void saluta () {
		super.saluta(); 
		System.out.println("Io Studio");
	}
}
