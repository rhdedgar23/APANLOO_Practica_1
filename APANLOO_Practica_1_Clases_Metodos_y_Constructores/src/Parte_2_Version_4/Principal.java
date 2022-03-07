package Parte_2_Version_4;

public class Principal {

	public static void main(String[] args) {
		
		Racional rac1= new Racional(2,3);
		String racStr1= rac1.getNum() + "/" + rac1.getDen();
		
		Racional rac2= new Racional(3,6);
		String racStr2= rac2.getNum() + "/" + rac2.getDen();
		
		String racStr3= Racional.sumaRacionales(rac1, rac2).getNum() + "/" + Racional.sumaRacionales(rac1, rac2).getDen();
		System.out.println("La suma de racionales es:\n" + racStr1 + " + " + racStr2 + " = " + racStr3);

	}
}
