package Parte_2_Version_2;

public class Principal {

	public static void main(String[] args) {
		
		Racional rac1= new Racional();
		rac1.num= 1;
		rac1.den= 3;
		String racStr1= rac1.num + "/" + rac1.den;
		
		Racional rac2= new Racional();
		rac2.num= 3;
		rac2.den= 5;
		String racStr2= rac2.num + "/" + rac2.den;
		
		String racStr3= Racional.sumaRacionales(rac1, rac2).num + "/" + Racional.sumaRacionales(rac1, rac2).den;
		System.out.println("La suma de racionales es:\n" + racStr1 + " + " + racStr2 + " = " + racStr3);
	}
}
