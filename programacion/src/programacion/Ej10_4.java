package programacion;

import java.util.Scanner;

/*Escribir un programa que lea códigos de personas de 8 caracteres de modo que los cuatro
primeros sean numéricos y contenidos entre 1990-1995 (un año), el quinto carácter sea solo (H
ó M) sexo, el sexto un número que representa el curso 1 ó 2 y los caracteres séptimo y octavo
pueden tener cualquier valor. Deben rechazarse los códigos que no cumplan estas condiciones.
La finalización de entrada de códigos se produce cuando se introduce el código “00000000”.
Al final, el programa debe sacar un informe indicando cuántos hombres y mujeres hay
matriculados en primero y segundo y cuántos códigos correctos han sido leídos.*/
public class Ej10_4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String codigo = "";
		int hombre_1 = 0, hombre_2 = 0, mujer_1 = 0, mujer_2 = 0, cod = 0;
		do {
			System.out.println("Introduce el codigo de una persona: ");
			codigo = teclado.nextLine();
			if (codigo.length() == 8) {
				int año = Integer.parseInt(codigo.substring(0, 4));
				char sexo = codigo.charAt(4);
				char curso = codigo.charAt(5);
				if (año >= 1990 && año <= 1995) {
				} else {

				}
				if (sexo == 'H') {

				} else if (sexo == 'M') {

				} else {

				}
				if (curso == '1') {

				} else if (curso == '2') {

				} else {

				}

				if (curso == '1' && sexo == 'H') {

					hombre_1++;

				} else if (curso == '2' && sexo == 'H') {

					hombre_2++;

				} else if (curso == '1' && sexo == 'M') {

					mujer_1++;

				} else if (curso == '2' && sexo == 'M') {

					mujer_2++;
				}

				if (año >= 1990 && año <= 1995 && sexo == 'H' || sexo == 'M' && curso == '1' || curso == '2') {
					cod++;
				}
			}
		} while (codigo.equals("00000000") != true);

		System.out.println("Hay " + hombre_1 + " hombres en primero, " + hombre_2 + " hombres en segundo y hay "
				+ mujer_1 + " mujeres en primero y " + mujer_2 + " en segundo. Se han escrito " + cod
				+ " codigos validos.");

	}

}
