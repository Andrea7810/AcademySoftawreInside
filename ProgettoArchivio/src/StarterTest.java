
public class StarterTest {

	public static void main(String[] args) {

		
		
		
		Documento documento1 = new Documento();
		
		System.out.println(documento1);
		
		DocumentoPrioritario documento2 = new DocumentoPrioritario();
		
		System.out.println(documento2);
		
		System.out.println("qualità --> " + documento1.calcolaQualita());
		
		System.out.println("qualità doc. prioritario --> " + documento2.calcolaQualita());
		
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@\n");
		
		Archivio archivio1 = new Archivio();
		
		
		DocumentoPrioritario docSpe1 = new DocumentoPrioritario("special" , 5);
		DocumentoPrioritario docSpe2 = new DocumentoPrioritario("speciale2", 9);
		
		archivio1.addDocumento(new Documento());
		archivio1.addDocumento(new Documento());
		archivio1.addDocumento(new Documento());
		archivio1.addDocumento(docSpe2);
		archivio1.addDocumento(docSpe1);

		System.out.println(docSpe1.calcolaQualita());   
		System.out.println(docSpe2.calcolaQualita());

		System.out.println(archivio1);
		
		
		
		System.out.println("#####################");	
		
		System.out.println(archivio1.trovaMigliore());
		
		
	}

}
