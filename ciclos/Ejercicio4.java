/****************************
 * @author Elietzer Jared Galicia Cordova
 * Fecha de creación: 09/04/2023
 * Fecha de modificación: 09/04/2023
 * Descrpción: Pruebas a numeros ingresados por teclado
 *****************************************/
package ciclos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		String response = "";
		Scanner inp = new Scanner(System.in);
		Scanner inpStr = new Scanner(System.in);

		float porPar = 0;
		float porImp = 0;

		float sumPar = 0;
		float sumImp = 0;
		
		float sumTotal = 0;
		do {
			System.out.print("Ingresa un numero: ");
			numeros.add(inp.nextInt());
			
			if (numeros.get(numeros.size() - 1) % 2 == 0) {
				porPar++;
				sumPar += numeros.get(numeros.size() - 1);
			} else {
				porImp++;
				sumImp += numeros.get(numeros.size() - 1);				
			}
			sumTotal += numeros.get(numeros.size() - 1);
			
			System.out.print("Decea otro numero (Si/No): ");
			response = inpStr.nextLine();
			
		} while (response.equalsIgnoreCase("si"));
	
		porImp = (porImp * 100) / numeros.size();
		porPar = (porPar * 100) / numeros.size();
		System.err.println("- - - - - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println("\nnumeros pares: %" + porPar);
		System.out.println("numeros impares: %" + porImp);
		System.out.println("Suma de numeros pares: " + sumPar);
		System.out.println("Suma de numeros impares: " + sumImp);
		System.out.println("Suma de todos los numeros: " + sumTotal);
		System.out.println("Numeros totales: " + numeros.size());
		
		inp.close();
		inpStr.close();
	}
}








