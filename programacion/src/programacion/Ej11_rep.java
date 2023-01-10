package programacion;

import java.util.Scanner;

public class Ej11_rep {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String dia, tarjeta;
		double precio = 0;
		int persona;
		System.out.println("Tarjeta CodePas:¿Si o No?");
		tarjeta = teclado.nextLine().toLowerCase();
		System.out.println("¿Que dia es?");
		dia = teclado.nextLine().toLowerCase();
		System.out.println("¿Cuantas personas sois?");
		persona = teclado.nextInt();
		if (dia.equals("miercoles")) {
			precio = persona * 5;
			if (tarjeta.equals("si")) {
				precio = precio * 0.9;
			}

		} else if (dia.equals("jueves")) {
			if (persona % 2 == 0) {
				precio = (11 * persona) / 2;
			} else {
				precio = ((11 * (persona -1)) / 2) + 8;
			}

			if (tarjeta.equals("si")) {
				precio = precio * 0.9;
			}
		}
		System.out.println("Las entradas cuestan " + precio + " euros");

	}

}
