package datosBasicos;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Resultado de la operacion (x+y)/(a*b)");
		
		System.out.print("Valor de x: ");
		float x = inp.nextFloat();
		
		System.out.print("Valor de y: ");
		float y = inp.nextFloat();
		
		System.out.print("Valor de a: ");
		float a= inp.nextFloat();
		
		System.out.print("Valor de b: ");
		float b = inp.nextFloat();
		
		System.out.println("Resultado: " + ((x + y)/(a * b)));
		
		inp.close();
	}
}
