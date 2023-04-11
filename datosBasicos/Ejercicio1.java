/****************************
 * @author Elietzer Jared Galicia Cordova
 * Fecha de creación: 09/04/2023
 * Fecha de modificación: 09/04/2023
 * Descrpción: Saber si un numero es primo o no
 *****************************************/
package datosBasicos;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Numero de horas trabajadas: ");
		float horas = inp.nextFloat();
		
		System.out.println("Coste por hora trabajada: ");
		float coste = inp.nextFloat();
		
		System.out.println("Total a pagar: $" + horas*coste);
		inp.close();
	}
}
