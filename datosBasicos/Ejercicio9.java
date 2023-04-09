package datosBasicos;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Formula general");
		
		System.out.print("Valor de a: ");
		float a = inp.nextFloat();
		
		System.out.print("Valor de b: ");
		float b = inp.nextFloat();
		
		System.out.print("Valor de c: ");
		float c = inp.nextFloat();

		float interRaiz = (b*b)-(4*a*c);
		
		float x1 = (float) ((-b + Math.sqrt(interRaiz))/2*a);
		float x2 = (float) ((-b - Math.sqrt(interRaiz))/2*a);
		
		System.out.println("*** Valores ***" + 
						"\n x1: " + x1 +
						"\n x2: " + x2);
		
		inp.close();
	}
}
