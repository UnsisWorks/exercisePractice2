/****************************
 * @author Elietzer Jared Galicia Cordova
 * Fecha de creación: 09/04/2023
 * Fecha de modificación: 09/04/2023
 * Descrpción: Saber si un numero es primo o no
 *****************************************/
package datosBasicos;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("*** Calcular la hipotenusa ***");
		
		System.out.print("cateto uno: ");
		float x = inp.nextFloat();
		
		System.out.print("cateto dos: ");
		float y = inp.nextFloat();
		
		System.out.println("Hipotenusa: " + (Math.sqrt((x*x) + (y*y))));
		
		inp.close();
	}
}
