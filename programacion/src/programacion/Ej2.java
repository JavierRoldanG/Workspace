package programacion;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, resultado, i = 1;
		System.out.println("Insertar un numero: ");
		num = teclado.nextInt();
		if (num >= 1 && num <= 10) {
			System.out.println("Tabla de Multiplicar de " + num);
			while (i <= 10) {
				resultado = num * i;
				System.out.println(num + "* " + i + "= " + resultado);
				i++;
			}

		} else
			System.out.println("No es posible hacer tabla");

		teclado.close();
	}

}
