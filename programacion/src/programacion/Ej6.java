package programacion;

import java.util.Scanner;

public class Ej6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, posicion = 1, sumaPar = 0, sumaImpar = 0;
		do {
			System.out.println("Introduce un numero ");
			num = teclado.nextInt();
			if (posicion % 2 == 0) {
				sumaPar += num;
			} else
				sumaImpar += num;
			posicion++;

		} while (num != 0);
			System.out.println("La suma de los numeros impares es " + sumaImpar );
			System.out.println("La suma de los numeros pares es " + sumaPar );
			teclado.close();
	}
}
