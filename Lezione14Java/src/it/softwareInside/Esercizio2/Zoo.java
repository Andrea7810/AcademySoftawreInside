package it.softwareInside.Esercizio2;

public class Zoo {

	private final int DIMENSIONE_ZOO = 10;
	
	private String nome;
	private Animale [] animali;
	
	
	
	public Zoo (String nome ) {
		
		setAnimale(new Animale [DIMENSIONE_ZOO]);
		setNome(nome);
		
	}
	
	
	public Zoo () {
		
		this("Safari");
	}
	
	
	@Override
	public String toString () {
		
		String ris = "";
		
		for (int i = 0; i < animali.length; i++) {
			ris += "\n" + animali[i];
		}
		
		return "Nome dello Zoo: " + this.nome + " Animali presenti: " + ris;
	}
	
	
	
	
	
	
	
	//metodi di set
	
	public void setNome (String nome) {
		
		this.nome = nome;
	}
	
	
	public void setAnimale (Animale [] animale) {
		
		this.animali = animale;
	}
	
	
	
	//metodi di get
	
	public String getNome () {
		
		return this.nome;
	}
	
	
	
	public Animale [] getAnimale () {
		
		return this.animali;
	}
	
	
	
	
	//altri metodi
	
	
	
public void stampaAnimali2() {
	
		
		for (int i = 0; i < animali.length; i++) {
			if(animali[i] == null)
				continue;
			else
				animali[i].saluta();
		}
	}
	
	
	
	
	
	public void stampaAnimali () {
		
		for (Animale animale : animali)
			
			if (animale == null)
				continue;
			else
				animale.saluta();
	}
	
	
	public boolean aggiungiAnimale (Animale animale) {
		
		if (animale == null)
			return false;
		
		for (int i = 0; i < animali.length; i++) {
			if (animali[i] == null) {
				animali[i] = animale;
				return true;
			}
		}
		
		return false;
	}
	
	
	
	public Animale removeAnimale (int posizione) {
		
		if (posizione < 0 || posizione >= animali.length) 
			return null;
		
		Animale animaleDaRimuovere = animali[posizione];
		animali[posizione] = null;
		return animaleDaRimuovere;
	}
	
	
	
	
}
