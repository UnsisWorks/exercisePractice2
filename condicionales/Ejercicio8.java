/****************************
 * @author Elietzer Jared Galicia Cordova
 * Fecha de creación: 09/04/2023
 * Fecha de modificación: 09/04/2023
 * Descrpción: Saber si un numero esta en un intervalo
 *****************************************/
package condicionales;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Intervalos");
		
		System.out.print("Valor inicial: ");
		float x = inp.nextFloat();
		
		System.out.print("Valor final: ");
		float y= inp.nextFloat();
		
		System.out.print("Valor final: ");
		float z = inp.nextFloat();
		
		if ((z >= x) && (z <= y)) {
			System.out.println("Esta en el intervalo");
		} else {
			System.out.println("Esta fuera del intervalo");
		}
		
		
		inp.close();
	}
}
