package programacion;

import java.util.Scanner;

/* Se define el factorial de un número N como N*(N-1)*(N-2)*.......*3*2*1. Hacer un programa que
lea un número N filtrando que debe ser mayor que cero y calcule su factorial*/

public class Ej8 {
	public static void main(String[]args) {
		Scanner teclado= new Scanner (System.in);
		int num, i, factorial=1;
		System.out.print("Inserte un numero: ");
		num=teclado.nextInt();
		for(i=num; i>0; i-- ) {
			factorial*=i;	
		}
		System.out.println("El factorial de"+" " +num +" "+ "es"+" " +factorial);
	}
}
