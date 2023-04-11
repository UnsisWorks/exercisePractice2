/****************************
 * @author Elietzer Jared Galicia Cordova
 * Fecha de creación: 09/04/2023
 * Fecha de modificación: 09/04/2023
 * Descrpción: Calcular el salario de un trabajador
 *****************************************/
package condicionales;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("");
		
		System.out.print("¿Cual es tu edad? ");
		float edad = inp.nextFloat();
		
		System.out.print("¿Cúales son tus ingresos? ");
		float ingre = inp.nextFloat();
		
		if ((edad >= 16) && (ingre > 500)) {
			System.out.println("Tiene que tributar");
		} else {
			
			System.out.println("Aún no tiene que tributar");
		}
		
		inp.close();
	}
}
