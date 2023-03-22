import java.util.Random;

public class StarterTelefono {

	public static void main(String[] args) {

		
		Random casuale = new Random ();
		
		
		Telefono [] telefoni = new Telefono [10];
		
		
		
		for (int i = 0; i < telefoni.length; i++) {
			
			Telefono telefonoTemporaneo = new Telefono();
			telefonoTemporaneo.setCosto(casuale.nextInt(50 , 901));
			telefoni [i] = telefonoTemporaneo;
			System.out.println("\n" + telefoni[i]);
		}
		
		
		System.out.println("\nIl telefono al costo minore è:");
		
		
		Telefono minTelefono = telefoni[0];
		
		for (int i = 0; i < telefoni.length; i++) {
			
			if (telefoni[i].getCosto() < minTelefono.getCosto()) {
				minTelefono = telefoni[i];
			}
			
		}
		
		System.out.println("\n" + minTelefono);
		
		
	}

}
