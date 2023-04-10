package condicionales;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int intNum = 0;
		String num = "";
		boolean feliz = false;
		boolean creciente = true;
		
		do {
			System.out.print("Ingrese un numero de 4 cifras: ");

			try {
				intNum = inp.nextInt();
				num = String.valueOf(intNum);
				
			} catch (Exception e) {
				System.err.println("Solo debe ingresar numeros");

			}
			if (num.length() < 4) {
				System.err.println("Rango de valor incorrecto");
			}

		} while (num.length() < 4);

		
		int primeros = Integer.parseInt(num.substring(0, 2));
		int ultimos = Integer.parseInt(num.substring(num.length() - 2, num.length()));
		System.out.println(primeros);
		System.out.println(ultimos);

		if (primeros > ultimos) {
			feliz = true;
		}
		
		for (int i = 0; i < num.length() - 1; i++) {
			if (num.charAt(i) > num.charAt(i + 1)) {
				creciente = false;
			}
		}
		
		if (feliz && creciente) {
			System.out.println("El numero es muy feliz");
		} else if (feliz) {
			System.out.println("El numero es feliz");
		} else if (creciente) {
			System.out.println("El numero es creciente");
		} else {
			System.out.println("El numero es infeliz");
		}

	}
}














