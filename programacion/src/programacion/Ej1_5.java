package programacion;

import java.util.Scanner;

public class Ej1_5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int numero, contador=2;
		boolean primo;
		System.out.println("Introduce un número");
		numero=teclado.nextInt();
		primo=true;
		while (primo && contador <numero) {
			primo = numero % contador !=0 ;
			
		}
		System.out.println("El numero "+numero+(primo ? "" : "no")+" es primo");
		

	}

}
