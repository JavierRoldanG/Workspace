
package programacion;
/*
Hacer un programa que lea un número N y nos escriba en la pantalla, mediante un
mensaje, si es o no primo (NOTA: Número primo es aquél que es divisible solo por
sí mismo y por la unidad)
Desarrollar este programa creando un método llamado primo que devuelva true
si el número es primo y false si no lo es*/

import java.util.Scanner;

public class Ejer1_5 {
	public static void main (String[]args) {
		Scanner teclado= new Scanner (System.in);
		int numero;
		boolean primo=true;
		System.out.println("Introduce un numero :");
		numero=teclado.nextInt();
		primo= esPrimo(numero);
		System.out.println("El numero "+ numero+ " es primo")
	}
	
}
