package programacion;

import java.util.Scanner;
 //Dada una frase de no más de 80 caracteres hacer un programa que busque cuántas mayúsculas y minúsculas tiene y lo imprima.//
public class Ej2_4 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		int mayuscula=0, minuscula=0;
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
			}
			System.out.println("La frase tiene "+mayuscula +"mayúsculas.");
			System.out.println("La frase tiene "+minuscula +"minúsculas.");
			
			
		
		} else System.out.println("No es valido");
		
			
		
		
		
	}

}
