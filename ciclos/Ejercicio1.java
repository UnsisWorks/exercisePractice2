package ciclos;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Numeros impares");
		
		System.out.print("Limite: ");
		float limit = inp.nextFloat();
		
		for (int i = 0; i <= limit; i++) {
			if (i % 2 != 0) {
				System.out.print(i + ", ");
			}
		}
		
		inp.close();
	}
}
