package programacion;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Inserte un numero: ");
		numero = teclado.nextInt();

		boolean primo = false;
		int divisor = 2;

		while (!primo && divisor <= numero / 2) {
			primo = numero % divisor == 0;
			divisor++;
		}
		if (primo)
			System.out.println("No es primo");
		else
			System.out.println("Es primo");

		teclado.close();
	}

}
