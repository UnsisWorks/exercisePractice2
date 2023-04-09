package datosBasicos;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Invertir numero");

		System.out.print("Valor de b: ");
		String num = inp.nextLine();

		for (int i = num.length() - 1; i >= 0; i--) {
			System.out.print(num.charAt(i));
		}
		System.out.println();

		inp.close();
	}
}
