package Parte_2_Version_4;

public class Racional {
	
	private int num, den;//dos atributos en vez de 4
	
	public Racional() {
		this.num=0;
		this.den=0;
	}
	
	public Racional(int num, int den) {
		this.num= num;
		this.den= den;
	}
	
	public static Racional sumaRacionales(Racional rac1, Racional rac2){//dos parametros en vez de 4 
		
		Racional rac3= new Racional();
		
		rac3.den= (rac1.den)*(rac2.den);
		rac3.num= (rac1.num*rac2.den)+(rac1.den*rac2.num);
		
		return rac3;
	}
	
	public void setNum(int num) {
		this.num= num;
	}
	
	public void setDen(int den) {
		this.den= den;
	}
	
	public int getNum() {
		return num;
	}
	
	public int getDen() {
		return den;
	}
}
