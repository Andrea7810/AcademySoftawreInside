
public class Starter {

	public static void main(String[] args) {

		
		Sala sala1 = new Sala ();
		
		System.out.println("SALA: " + sala1);
		
		
		System.out.println("****************");
		
		
		Cucina cucina1 = new Cucina ();
		
		System.out.println("CUCINA: " + cucina1);
		
		
		
		System.out.println("*****************");
		
		Casa casa1 =  new Casa();
		
		System.out.println(casa1);
				
		
		System.out.println("****************");
		
		System.out.println("AREA TOT CASA: " + casa1.calcoloAreaCasa());
		
		
		
	}

}
