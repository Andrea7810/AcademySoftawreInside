
public class CodaConPriorita extends Coda {

	
	public  CodaConPriorita () {
		
		super();
	}
	
	
	
	@Override
	public String toString () {
		
		return super.toString();
	}
	
	
	@Override
	public Persona restituisciProssimo () {
		
		
		for (int i = 0; i < personeInCoda.size(); i++) {
			
			if (personeInCoda.get(i).getEta() > 60)  {
				
				return personeInCoda.remove(i);
			
			}
			
		}
		
		
		return super.restituisciProssimo();
	}
	
	
}
