package it.softwareInside.es2Classi;

public class StarterPcMonitor {

	public static void main(String[] args) {

		
		Pc pc1 = new Pc ();
		
		System.out.println(pc1.toString());
		
		
		pc1.setMonitor(new Monitor("Hp", 170, 19));
		
		System.out.println(pc1);
		
	}

}
