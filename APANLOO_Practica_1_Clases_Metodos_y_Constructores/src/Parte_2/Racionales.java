package Parte_2;

public class Racionales {

	int num, den;//dos atributos en vez de 4
	
	public static void main(String[] args) {
		
		Racionales rac1= new Racionales();
		rac1.num= 1;
		rac1.den= 3;
		String racStr1= rac1.num + "/" + rac1.den;
		
		Racionales rac2= new Racionales();
		rac2.num= 3;
		rac2.den= 4;
		String racStr2= rac2.num + "/" + rac2.den;
		
		String racStr3= sumaRacionales(rac1, rac2).num + "/" + sumaRacionales(rac1, rac2).den;
		System.out.println("La suma de racionales es:\n" + racStr1 + " + " + racStr2 + " = " + racStr3);
	}
	
	public static Racionales sumaRacionales(Racionales rac1, Racionales rac2){//dos parametros en vez de 4 
		
		Racionales rac3= new Racionales();
		
		rac3.den= (rac1.den)*(rac2.den);
		rac3.num= (rac1.num*rac2.den)+(rac1.den*rac2.num);
		
		return rac3;
	}
}
