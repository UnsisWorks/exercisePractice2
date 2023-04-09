package datosBasicos;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Resultado de la operacion sqrt((x + y * z)^5)");
		
		System.out.print("Valor de x: ");
		float x = inp.nextFloat();
		
		System.out.print("Valor de y: ");
		float y = inp.nextFloat();
		
		System.out.print("Valor de z: ");
		float z = inp.nextFloat();
		
		System.out.println("Resultado: " + (Math.sqrt(Math.pow(x + y * z, 5))));
		
		inp.close();
	}
}
