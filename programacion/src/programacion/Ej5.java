package programacion;

import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
		int num, suma = 0, contador = 0;
		Scanner teclado = new Scanner(System.in);
			System.out.println("Introducir un numero ");
			num = teclado.nextInt();
			suma += num;
		 while (num != 0) {
			 System.out.println("Introducir un numero ");
				num = teclado.nextInt();
				suma += num;
				contador++;
		 }
		
		System.out.println("La suma de los numeros es " + suma);
		System.out.println("Se han instrucido " + contador + " numeros.");
		teclado.close();

	}

}
