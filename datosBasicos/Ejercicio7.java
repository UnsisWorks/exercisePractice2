/****************************
 * @author Elietzer Jared Galicia Cordova
 * Fecha de creación: 09/04/2023
 * Fecha de modificación: 09/04/2023
 * Descrpción: Saber si un numero es primo o no
 *****************************************/
package datosBasicos;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Calcular peso total de un paquete");
		
		System.out.print("Total de payasos: ");
		float payasos = inp.nextFloat();
		
		System.out.print("Total de muñecas: ");
		float munecas = inp.nextFloat();
		
		System.out.println("Peso total: " + ((payasos*112) + (munecas*75))/1000 + "kg");
		
		inp.close();
	}
}
