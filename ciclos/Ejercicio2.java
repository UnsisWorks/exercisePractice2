/****************************
 * @author Elietzer Jared Galicia Cordova
 * Fecha de creación: 09/04/2023
 * Fecha de modificación: 09/04/2023
 * Descrpción: Saber si un numero es primo o no
 *****************************************/

package ciclos;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Numeros primos");
		
		System.out.print("Limite: ");
		int num = inp.nextInt();
		
		boolean primo = true;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				primo = false;
				System.err.println("El numero no es primo");
				break;
			}
		}
		
		if (primo) {
			System.out.println("El numero es primo");
		}
		
		inp.close();
	}
}
