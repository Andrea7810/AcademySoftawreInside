
public class StarterFunzioni15InPoi {

	public static void main(String[] args) {

		
		EserciziFunzioni15InPoi prova = new EserciziFunzioni15InPoi();
		
		
		
		//Esercizio15Prova
		
		int vett [] = { 5 ,3 ,8};
		
		boolean ris = prova.AlmenoUnoMaggiore(vett, 7);
		
		System.out.println(ris);
		
		
		
		//Esercizio16Prova
		
		int vett1 [] = {3 , 6 , 10 };
		
		boolean ris1 = prova.AlmenoUnoMinore(vett1, 4);
		
		System.out.println(ris1);
		
		
		
		//Esercizio17Prova
		
		int vett2 [] = {5 , 7 , 19 , 33};
		
		boolean ris2 = prova.AlmenoUnoUguale(vett2, 33);
		
		System.out.println(ris2);
		
		
		
		//Esercizio21Prova
		
		int vett3 [] = {5 , 8 , 8 , 8 , 3 , 5  , 5};
		
		boolean ris3 = prova.AlmenoTreUgualeConsecutivi(vett3, 8);
		
		System.out.println(ris3);
		
		
		//Esercizio22Prova
		
		int vett4 [] = { 2 , 3 , 6 , 6 , 14 ,8};
		
		boolean ris4 = prova.PosizionePariElementiPari(vett4);
		
		System.out.println(ris4);
		
		
		
	}

}
