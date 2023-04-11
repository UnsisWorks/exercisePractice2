/****************************
 * @author Elietzer Jared Galicia Cordova
 * Fecha de creación: 09/04/2023
 * Fecha de modificación: 09/04/2023
 * Descrpción: Saber si un numero es capicua
 *****************************************/
package condicionales;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		// Lectura de datos
		System.out.println("¿El numero es capicua?");
		
		System.out.print("Ingresa un numero: ");
		String num = inp.nextLine();
		
		// Validacion de longitud del numero
		if (num.length() == 4) {
			
			boolean band = true;
			// Comparacion del contenido
			for (int i = 0; i < num.length(); i++) {
				if (num.charAt(i) != num.charAt(num.length()-1-i)) {
					System.err.println("No lo es");
					band = false;
					break;
				}
			}
			
			if (band) {
				System.out.println("Es un Capicúa");
			}
		} else {
			System.err.println("El numero debe ser de 4 digitos");
		}

		
		inp.close();
	}
}
