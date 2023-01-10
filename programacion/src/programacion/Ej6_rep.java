package programacion;

import java.util.Scanner;

public class Ej6_rep {
	public static void main(String[] args) {
		int hora;
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Que hora es?");
		hora = teclado.nextInt();
		if (hora <= 12 && hora > 5) {
			System.out.println("Buenos dias");
		} else if (hora > 12 && hora <= 20) 
			System.out.println("Buenas tardes");
		 else 
			System.out.println("Buenas noches");
		
	}

}
