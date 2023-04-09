package condicionales;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int mes = 0;
		String strMes = "";

		do {
			System.out.print("Ingrese el numero de mes (1 - 12): ");

			try {
				mes = inp.nextInt();

			} catch (Exception e) {
				System.err.println("Solo debe ingresar numeros");

			}
			if (mes < 0 || mes > 12) {
				System.err.println("Rango de valor incorrecto");
			}

		} while (mes < 0 || mes > 12);

		switch (mes) {
		case 1: {
			strMes = "Enero";
			break;
		}
		case 2: {
			strMes = "Febrero";
			break;
		}
		case 3: {
			strMes = "Marzo";
			break;
		}
		case 4: {
			strMes = "Abril";
			break;
		}
		case 5: {
			strMes = "Mayo";
			break;
		}
		case 6: {
			strMes = "Junio";
			break;
		}
		case 7: {
			strMes = "Julio";
			break;
		}
		case 8: {
			strMes = "Agosto";
			break;
		}
		case 9: {
			strMes = "Septiembre";
			break;
		}
		case 10: {
			strMes = "Octubre";
			break;
		}
		case 11: {
			strMes = "Noviembre";
			break;
		}
		case 12: {
			strMes = "Diciembre";
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + mes);
		}
		
		System.out.println("El mes es: " +  strMes);

	}
}
