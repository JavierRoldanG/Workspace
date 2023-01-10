package examen;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ej4 {
	public static void main (String []args) {
		/* El programa debe preguntar un nombre de producto, su precio unitario y la cantidad de unidades que se desean adquirir. Con dichos
datos, mostrará una cadena con el nombre del producto, seguido de su precio unitario con 6 dígitos enteros y 2 decimales, el número
de unidades con 3 dígitos y el precio total, con 8 dígitos enteros y 2 decimales.
Después, debe solicitar una cantidad que será la que el cliente entrega para realizar el pago, indicando la cantidad a devolver, si
procede; en caso de que la cantidad sea inferior a la que debe pagar, mostrará un mensaje de error indicando de nuevo el precio
total. Si debe devolverse alguna cantidad, debe calcular el número óptimo de billetes y/o monedas a devolver, sabiendo que las
cantidades son en euros; en caso contrario, mostrará un mensaje indicando que se abona la cantidad exacta.
NOTA: Vamos a suponer que solo devolvemos: 500, 200, 100, 50, 20, 5, 2 y 1 euros; marcando el total de céntimos (restantes), sin
calcular las monedas de céntimo necesarias. */
		Scanner teclado = new Scanner (System.in);
		String producto;
		double precio, total, pagado;
		int unidades;
		System.out.println("Inserte el producto a comprar:");
		producto = teclado.nextLine();
		System.out.println("Inserte el precio a pagar");
		precio= teclado.nextDouble();
		System.out.println("Inserte cuantos quiere");
		unidades = teclado.nextInt();
		total= precio*unidades;
		DecimalFormat unitario=new DecimalFormat ("000000.00");
		DecimalFormat unidad= new DecimalFormat ("000");
		DecimalFormat precio_total= new DecimalFormat ("00000000.00");
		System.out.println("El precio total de "+unidad.format(unidades) + " de " + producto + " con precio "+ unitario.format(precio)+" es " + precio_total.format(total));
		pagado=teclado.nextDouble();
		if (pagado<total) {
			System.out.println ("QUE PAGUES MOROSO DE MIERDA");
		} else if (pagado=total) {
			System.out.println("Muy buena carcamal");
		}
		
	}

}
