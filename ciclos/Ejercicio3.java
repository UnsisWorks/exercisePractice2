/****************************
 * @author Elietzer Jared Galicia Cordova
 * Fecha de creación: 09/04/2023
 * Fecha de modificación: 09/04/2023
 * Descrpción: Saber el valor n de una serie
 *****************************************/
package ciclos;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Valor n de una serie");
		
		System.out.print("Limite: ");
		int limit = inp.nextInt();
		float result = 4;
		
		for (int i = 0; i <= limit; i+= 2) {
			result -= (4/i);
		}
		
		System.out.println("El valor es: " + result);
		
		inp.close();
	}
}
