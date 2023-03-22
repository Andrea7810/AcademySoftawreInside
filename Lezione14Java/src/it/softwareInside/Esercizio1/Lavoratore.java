package it.softwareInside.Esercizio1;

public class Lavoratore extends Persona{

	
	private double salarioMinimo;
	
	
	public Lavoratore (String nome , int eta, double salarioMinimo) {
		
		super(nome, eta);
		setSalarioMinimo(salarioMinimo);
	}
	
	
	public Lavoratore () {
		
		this("Mario", 24, 1200);
	}
	
	
	
	
	@Override
	public String toString () {
		
		return super.toString() + " Salario Minimo: " + this.salarioMinimo;
	}
	
	
	
	
	
	//metodi set
	
	
	public void setSalarioMinimo (double salarioMinimo) {
		
		this.salarioMinimo = salarioMinimo;
	}
	
	
	
	//metodi di get
	
	public double getSalarioMinimo () {
		
		return this.salarioMinimo;
	}
	
	
	
	//altri metodi
	
	@Override
	public void saluta () {
		
		super.saluta();
		System.out.print(" Ho " + this.salarioMinimo + " di salario minimo.");
	}
	
}
