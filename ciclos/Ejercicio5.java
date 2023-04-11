/****************************
 * @author Elietzer Jared Galicia Cordova
 * Fecha de creación: 09/04/2023
 * Fecha de modificación: 09/04/2023
 * Descrpción: Saber el valor de una sumatoria
 *****************************************/
package ciclos;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		System.out.print("Ingresa un numero: ");
		int n = inp.nextInt();
		float result = 0;
		
		for (int i = 0; i <= n; i++) {
			result += Math.PI * (i * i);
		}
		
		System.out.println("El resultado es: " + result);
		
		inp.close();

	}
}
