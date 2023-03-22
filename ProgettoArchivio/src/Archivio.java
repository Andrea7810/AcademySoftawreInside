import java.util.ArrayList;

public class Archivio {

	
	private ArrayList<Documento> documenti;
	
	
	public Archivio () {
		
		setDocumento(new ArrayList<>());
	}
	
	
	@Override
	public String toString () {
		
		return "Documenti: " + this.documenti;
	}
	
	
	
	
	
	
	//metodi di get
	
	public ArrayList<Documento> getDocumento () {
		
		return this.documenti;
	}
	
	
	
	//metodi di set
	
	public void setDocumento (ArrayList<Documento> documenti) {
		
		this.documenti = documenti;
	}
	
	
	
	//altri metodi
	
	
	public void addDocumento (Documento documento) {
		
		documenti.add(documento);
	}
	
	
	public Documento trovaMigliore () {
		
		
		for (int i = 1; i < documenti.size(); i++) {
			
			if( documenti.get(i).calcolaQualita() > documenti.get(i - 1).calcolaQualita()) {
				Documento docMigliore = documenti.get(i);
				return docMigliore;
			}
			
		}
		
		return null;
	}
	
	
	
}
