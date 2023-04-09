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
