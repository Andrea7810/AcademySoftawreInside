import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {

	Coda coda1 = new Coda();
	
	Persona persona1 = new Persona("Maiolo", 50);
	Persona persona2 = new Persona("Luca", 50);
	Persona persona3 = new Persona("PiP", 50);
	Persona persona4 = new Persona("oLIO", 50);
	Persona persona5 = new Persona("gha", 50);
	
	assertTrue(coda1.aggiungiPersona(persona1));
	assertTrue(coda1.aggiungiPersona(persona2));
	assertTrue(coda1.aggiungiPersona(persona3));
	assertTrue(coda1.aggiungiPersona(persona4));
	assertTrue(coda1.aggiungiPersona(persona5));

	System.out.println(coda1);
	
	
	assertEquals(coda1.restituisciProssimo(), persona1);
	
	
	}

	
	
	
	@org.junit.Test
	public void test2() {
		
		
		CodaConPriorita coda1 = new CodaConPriorita();
		
		Persona p1 = new Persona("Caro", 64);
		
		coda1.aggiungiPersona(new Persona("Raro", 53));
		coda1.aggiungiPersona(new Persona("Raro", 56));
		coda1.aggiungiPersona(new Persona("Raro", 34));
		coda1.aggiungiPersona(p1);
		coda1.aggiungiPersona(new Persona("Raro", 42));

		
		System.out.println(coda1);
		assertEquals(coda1.restituisciProssimo(),  p1);
		
		
		
	}
	
}
