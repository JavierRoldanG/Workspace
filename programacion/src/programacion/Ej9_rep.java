package programacion;

import java.util.Scanner;

public class Ej9_rep {
	public static void main (String[]args) {
		Scanner teclado=new Scanner (System.in);
		int dia, mes;
		System.out.println ("Insertar dia");
		dia= teclado.nextInt();
		System.out.println("Insertar mes");
		mes= teclado.nextInt();
		if (dia>22 && mes==7 || dia <= 22 && mes==8) {
			System.out.println ("Eres leo");
		} else if (dia>22 && mes== 8 || dia <=22 && mes==9) {
			System.out.println("Eres un mierdas porque no eres leo");
		}
		
	}

}
