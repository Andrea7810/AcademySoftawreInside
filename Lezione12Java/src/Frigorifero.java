
public class Frigorifero {

	private char classeEnergetica;
	private double costo;
	private String marca;
	private boolean isAntiFroz;
	
	
	public Frigorifero (char classeEnergetica , double costo , String marca , boolean isAntiFroz) {
		
		setClasseEnergetica(classeEnergetica);
		setCosto(costo);
		setMarca(marca);
		isAntiFroz(isAntiFroz);
	}
	
	
	public Frigorifero () {
		
		this('A', 670, "Samsung", true);
	}
	
	
	
	@Override
	public String toString () {
		
		String ris;
				
		if (isAntiFroz)
			ris = "Si";
		else
			ris = "No";
		
		return "Classe Energetica: " + this.classeEnergetica + " Costo: " + this.costo + " Marca: " + this.marca + " E' anti froz: " + ris;
	}
	
	
	
	
	
	
	
	
	//metodi set
	
	public void setClasseEnergetica (char classeEnergetica) {
		
		switch (classeEnergetica) {
		case 'A':
			this.classeEnergetica = classeEnergetica;
			break;
			
		case 'B':
			this.classeEnergetica = classeEnergetica;
			break;
		
		case 'C':
			this.classeEnergetica = classeEnergetica;
			break;
			
		case 'D':
			this.classeEnergetica = classeEnergetica;
			break;
			
		case 'E':
			this.classeEnergetica = classeEnergetica;
			break;
			
		case 'F':
			this.classeEnergetica = classeEnergetica;
			break;	

		default: this.classeEnergetica = 'F';
			break;
		}
		
		this.classeEnergetica = classeEnergetica;
	}
	
	
	
	public void setCosto (double costo) {
		
		if (costo <= 0)
			this.costo = - costo;
		else
			this.costo = 250;
		
	}
	
	
	
	public void setMarca (String marca) {
		
		this.marca = marca;
	}
	
	
	public void isAntiFroz (boolean isAntiFroz) {
		
		this.isAntiFroz = isAntiFroz;
	}
	
	
	
	
	//metodi get
	
	
	
	
	public char getClasseEnergetica () {
		
		return this.classeEnergetica;
	}
	
	
	
	public double getCosto () {
		
		return this.costo;
	}
	
	
	public String getMarca () {
		
		return this.marca;
	}
	
	
	public boolean isAntiFroz () {
		
		return this.isAntiFroz;
	}
	
	
	
	
		
}
