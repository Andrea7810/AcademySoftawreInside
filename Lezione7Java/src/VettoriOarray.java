
public class VettoriOarray {

	public static void main(String[] args) {

		//una struttura dati è un modo per organizzare i miei dati;
		// le variabili sono una struttura dati;
		// il vettore o array è una struttura dati; (insieme di più variabili);
		
		// per creare un vettore ho bisogno di usare questa sintassi:
		
		/*
		 * tipoVettore [] nome Vettore = new TipoVettore [dimensione_vettore]
		 * 
		 * 
		 * 
		 */
		
		int [] vettNumeri = new int [3];
		
		vettNumeri [0]= 10; //tra parentesi quadre va inserita la posi<ione in cui va messo l'elemento
		
		vettNumeri [2] = 60;
		
		System.out.println(vettNumeri [0]);
		System.out.println(vettNumeri [1]);
		System.out.println(vettNumeri [2]);

		System.out.println("##########");
		
		int i = 0;
		
		while (i < vettNumeri.length) {
			
			System.out.print(vettNumeri[i] + " ");
			
			i++;
		}
			
		
		
	}

}
