package programacion;

import java.util.Scanner;

public class Ej8_4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String frase;
		char caracteres, caracter_cambiado;
		int posicion;
		System.out.println("Inserte una frase:");
		frase = teclado.nextLine();
		frase = frase.toUpperCase();
		for (int i = 0; i < frase.length(); i++) {
			caracteres = frase.charAt(i);
			posicion = (int) caracteres + 3;
			caracter_cambiado = (char) posicion;
			System.out.println(caracter_cambiado);
		}
	}
}
