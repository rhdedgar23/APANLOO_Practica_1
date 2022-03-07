package Parte_2_Version_3;

public class Principal {

	public static void main(String[] args) {
		
		Racional rac1= new Racional();
		rac1.setNum(1);
		rac1.setDen(3);
		String racStr1= rac1.getNum() + "/" + rac1.getDen();
		
		Racional rac2= new Racional();
		rac2.setNum(3);
		rac2.setDen(6);
		String racStr2= rac2.getNum() + "/" + rac2.getDen();
		
		String racStr3= Racional.sumaRacionales(rac1, rac2).getNum() + "/" + Racional.sumaRacionales(rac1, rac2).getDen();
		System.out.println("La suma de racionales es:\n" + racStr1 + " + " + racStr2 + " = " + racStr3);

	}
}
