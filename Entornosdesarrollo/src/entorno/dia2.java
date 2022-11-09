package entorno;

import java.util.Scanner;

public class dia2 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int A,B,suma=0;
		System.out.println("Inserte A:");
		A=teclado.nextInt();
		System.out.println("Inserte B:");
		B=teclado.nextInt();
		if (A>B) System.out.println("Error" + A + "es mayor que" + B);
		else {
			for (int contador= A+1; contador< B; contador++) {
			suma+= contador;
			}
			System.out.println("La suma de los numeros entre " + A + "y " + B + "es " + suma);
		}
			
	}
}
