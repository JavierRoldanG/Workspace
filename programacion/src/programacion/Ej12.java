package programacion;

import java.util.Scanner;

/* Realizar un programa que elija mediante un menú un tipo de figura:

 Triángulo
 Cuadrado
 Rectángulo
Una vez elegida la opción nos pida en cada caso los datos necesarios para calcular su área y nos
la muestre. */
public class Ej12 {
	public static void main (String[]args) {
		Scanner teclado= new Scanner (System.in);
		int figura;
		System.out.println("Elegir figura a la que calcular su area:");
		System.out.println("1. Triángulo: ");
		System.out.println("2. Cuadrado: ");
		System.out.println("3. Rectángulo: ");
		System.out.println("Introduzca eleccion: ");
		figura=teclado.nextInt();
		switch (figura) {
		case 1:
			System.out.println("Has seleccionado el triángulo:");
			double base, altura, area;
			System.out.println("Area= (Base * Altura)/2");
			System.out.println("Introducir dato de base:");
			base= teclado.nextDouble();
			System.out.println("Introducir dato de altura:");
			altura= teclado.nextDouble();
			area= (base*altura)/2;
			System.out.println("El resultado es"+" "+area);
			break;
		case 2:
			System.out.println("Has seleccionado el cuadrado:");
			double lado, a;
			System.out.println("Area= Lado*Lado");
			System.out.println("Introducir dato de lado:");
			lado= teclado.nextDouble();
			a= lado * lado;
			System.out.println("El resultado es"+" "+a);
			break;
		case 3:
			System.out.println("Has seleccionado el rectángulo:");
			double b, h, s;
			System.out.println("Area= Base * Altura");
			System.out.println("Introducir dato de base:");
			b= teclado.nextDouble();
			System.out.println("Introducir dato de altura:");
			h= teclado.nextDouble();
			s= b*h;
			System.out.println("El resultado es"+" "+s);
			break;
		}
	}
	

}
