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
