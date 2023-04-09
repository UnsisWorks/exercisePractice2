package condicionales;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("comparar si una divicion da 0");
		
		System.out.print("Valor de x: ");
		float x = inp.nextFloat();
		
		System.out.print("Valor de y: ");
		float y = inp.nextFloat();
		
		if (y == 0) {
			System.err.println("Error, el divisor no puede ser 0");
		} else {
			System.out.println("Resultado: " + (x /y));
		}
		
		inp.close();
	}
}
