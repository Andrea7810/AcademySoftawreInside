
public class Zoo {

	
	private final int DIMENSIONE_ZOO = 10;
	private String nome;
	private Animale [] animali;
	
	
	public Zoo (String nome) {
		
		setNome(nome);
		setAnimale(new Animale [DIMENSIONE_ZOO]);
	}
	
	
	public Zoo () {
		
		this("Safari");
	}
	
	
	
	@Override
	public String toString () {
		
		String animaliTot = "";
		
		for (int i = 0; i < animali.length; i++) {
			animaliTot += "\n" +  animali[i];
		}
		
		
		
		return "Nome dello Zoo: " + this.nome + "\nAnimali: " + animaliTot;
	}
	
	
	
	
	
	
	//metodi set
	
	public void setNome (String nome) {
		
		this.nome = nome;
	}
	
	
	public void setAnimale (Animale [] animale) {
		
		this.animali = animale;
	}
	
	
	
	
	
	//metodi get
	
	
	public String getNome () {
		
		return this.nome;
	}
	
	
	
	public Animale [] getAnimale () {
		
		return this.animali;
	}
	
	
	
	
	//altri metodi
	
	
	public void stampaAnimali () {
		
		for (int i = 0; i < animali.length; i++) {
			System.out.println(animali[i]);
		}
	}
	
	
	
	public Animale rimuoviAnimale (int pos) {
		
		Animale animaleUscito = new Animale ();
		
		if (pos < 0 || pos > animali.length)
			return null;
		
		animaleUscito = animali[pos];
		this.animali[pos] = null;
		return animaleUscito;
		
	}
	
	
	
	public boolean aggiungiAnimale (Animale animale) {
		
		if (animale == null)
			return false;
		
		int cont = 0;
		
		for (int i = 0; i < animali.length; i++) {
			
			if(animale.getSpecie().equals("Leone") && animale.getSesso() == 'M')
				cont++;
				
			if (cont == 2)
				return false;
			
			
			if (animali[i] == null) {
				animali[i] = animale;
				return true;	
			}
			
		}
		
		return false;
		
	}
	
	
	
	
}
