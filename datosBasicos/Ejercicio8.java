/****************************
 * @author Elietzer Jared Galicia Cordova
 * Fecha de creación: 09/04/2023
 * Fecha de modificación: 09/04/2023
 * Descrpción: Saber si un numero es primo o no
 *****************************************/
package datosBasicos;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Calcular la velocidad de un objeto");

		System.out.print("Distancia (km): ");
		float d = inp.nextFloat();

		System.out.print("tiempo (h): ");
		float t = inp.nextFloat();

		System.out.println("Velocidad: " + d/t + "km/h");
		inp.close();
	}
}
