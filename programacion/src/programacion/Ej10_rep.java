package programacion;

import java.util.Scanner;

public class Ej10_rep {
	public static void main (String []args) {
		Scanner teclado= new Scanner (System.in);
		int hora, minuto, s=0;
		System.out.println("Inserte hora");
		hora = teclado. nextInt();
		System.out.println("Inserte minutos");
		minuto= teclado. nextInt();
		s= (24*3600) - ((hora * 3600)+ (minuto*60));
		System.out.println("Quedan "+ s + " segundos");
		
	}

}
