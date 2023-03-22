import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ArchivioTest {

	@Test
	public void test() {
		
		Documento documento = new Documento("ciao");
		
		assertEquals(documento.getTesto() , "ciao");
		
				
		
		
	}

}
