
public class EserciziFunzioni15InPoi {

	
	//Esercizio15
	public boolean AlmenoUnoMaggiore (int [] vett , int numero) {
		
		
		boolean AlmenoUnoMaggiore = false;
		
		for (int i = 0; i < vett.length; i++) {
			
				if (vett[i] > numero) {
					AlmenoUnoMaggiore = true;
					break;
				}
				
		}
			return AlmenoUnoMaggiore;	
			
	}
	
	
	
	//Esercizio16
	public boolean AlmenoUnoMinore (int [] vett, int numero) {
		
		boolean AlmenoUnoMinore = false;
		
		for (int i = 0; i < vett.length; i++) {
			
			if(vett[i] < numero) {
				AlmenoUnoMinore = true;
		     	break;
			}
		}
		
		return AlmenoUnoMinore;
	}
	
	
	
	//Esercizio17
	public boolean AlmenoUnoUguale (int [] vett, int numero) {
		
		boolean AlmenoUnoUguale = false;
		
		for (int i = 0; i < vett.length; i++) {
			
			if(vett[i] == numero) {
				AlmenoUnoUguale = true;
				break;
			}
		}
		
		return AlmenoUnoUguale;
	}
	
	
	
	//Esercizio18
	public boolean AlmenoUnoPari (int [] vett, int numero) {
		
		boolean AlmenoUnoPari = false;
		
		for (int i = 0; i < vett.length; i++) {
			
			if(vett[i] % 2 == 0) {
				AlmenoUnoPari = true;
				break;
			}
			
		}
		
		return AlmenoUnoPari;
	}

	
	
	//Esercizio19
	public boolean AlmenoUnoDispari (int [] vett , int numero) {
		
		boolean AlmenoUnoDispari = false;
		
		for (int i = 0; i < vett.length; i++) {
			
			if (vett[i] % 2 != 0) {
				AlmenoUnoDispari = true;
				
			}
		}
		
		return AlmenoUnoDispari;
	}
	
	
	
	//Esercizio20
	public boolean AlmenoTreUguali (int [] vett, int numero) {
		
		boolean AlmenoTreUguali = false;
		int cont = 0;
		
		for (int i = 0; i < vett.length; i++) {
			
			if(vett[i] == numero) {
				cont++;
			} else if (cont == 3) {
				AlmenoTreUguali = true;
				break;
			}
			
		}
		
		return AlmenoTreUguali;
	}
	
	
	
	//Esercizio21
	public boolean AlmenoTreUgualeConsecutivi (int [] vett , int numero) {
		
		boolean treConsecutiviUguali = false;
		int cont = 0;
		
		for (int i = 0; i < vett.length; i++) {
			
			if (vett[i] == numero) {
				
				cont++;
			} else
				cont = 0;

			if (cont == 3) {
				treConsecutiviUguali = true;
				break;
			}
		}
		
		return treConsecutiviUguali;
	}
	
	
	
	//Esercizio22
	public boolean PosizionePariElementiPari (int [] vett) {
		
		boolean PosizionePariElementiPari = false;
		
		for (int i = 0; i < vett.length; i+=2) {
			
			if(vett[i] % 2 == 0) {
				PosizionePariElementiPari = true;	
			} else
				PosizionePariElementiPari = false;
			
		}
		
		return PosizionePariElementiPari;
	}
	
	
}
