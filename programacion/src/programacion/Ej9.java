package programacion;

import java.util.Scanner;

/* Un número se dice que es perfecto cuando la suma de sus divisores propios –todos los divisores
a excepción del propio número-, es igual a dicho número. Hacer un programa que lea un
número y nos diga si es perfecto o no. */
public class Ej9 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, i = 1, resto, suma=0;
		System.out.print("Inserta un numero: ");
		num = teclado.nextInt();
		
		
		while (num != i && num > i) {
			resto = num % i;
			if (resto == 0) {
				suma+=i;
				
			}
			i++;
		} if(suma==num) {
			System.out.print("El número"+" "+num+" "+"es perfecto");	
		}else System.out.print("El número"+" "+num+" "+"no es perfecto");
		
	}
}