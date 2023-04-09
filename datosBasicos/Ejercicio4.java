package datosBasicos;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Numero 1: ");
		int x = inp.nextInt();
		
		System.out.print("Numero 2: ");
		int y = inp.nextInt();
		
		System.out.println(x + " / " + y + " da un cociente " + (x/y) + " y un resto " + (x%y));
		
		inp.close();
	}
}
