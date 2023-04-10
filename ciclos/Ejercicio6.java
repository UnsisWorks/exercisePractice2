package ciclos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {

			ArrayList<Integer> numeros = new ArrayList<Integer>();
			Scanner inp = new Scanner(System.in);
			
			int primos = 0;
			
			do {
				System.out.print("Ingresa un numero: ");
				numeros.add(inp.nextInt());
				
				for (int i = 2; i < numeros.get(numeros.size() - 1); i++) {
					if (numeros.get(numeros.size() - 1) % i == 0 || numeros.get(numeros.size() - 1) == 0) {
						primos--;
						break;
					} else {
					}
				}
				primos++;
				
			} while (numeros.get(numeros.size() - 1) != 0);
		
			System.out.println("Numeros primos totales: " + primos);
			
			inp.close();
		
	}
}
