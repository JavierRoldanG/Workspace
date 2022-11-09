package programacion;

import java.util.Scanner;

public class Ej7_4 {

	public static void main(String[]args) {
		/*Leer una frase por teclado y escribir a continuación cuantas mayúsculas, minúsculas y números
contiene.*/
		Scanner teclado= new Scanner (System.in);
		int mayuscula=0, minuscula=0, numero=0;
		char parte=' ';
		System.out.println("Inserte una frase:");
		String frase= teclado.nextLine();
		int n=frase.length();
		if(frase.length()<80) {
			for (int i=0; i< frase.length(); i++) {
				if(Character.isUpperCase(frase.charAt(i))) 
	                 mayuscula++;
				 if(Character.isLowerCase(frase.charAt(i))) 
		             minuscula++;
				 if(Character.isDigit(frase.charAt(i))) 
					 numero++;
			}
			System.out.println("La frase tiene "+mayuscula +"mayúsculas.");
			System.out.println("La frase tiene "+minuscula +"minúsculas.");
			System.out.println("La frase tiene "+numero +"números.");
			
			
		
		} else System.out.println("No es valido");
		
			
	}
}