package condicionales;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("IMC - libras a kilos");
		
		System.out.print("¿Cual es tu peso? (lb) ");
		float peso = inp.nextFloat();
		
		System.out.print("¿Cual es tu estatura? (cm) ");
		float estatura = inp.nextFloat();

		float estaturaCm = estatura/100;
		float pesoKg = (float) (peso / 2.20462262);
		float imc = pesoKg / (estaturaCm*estaturaCm);
		
		String result = "hola";
		
		if (imc < 16.0) {
			result = "Criterio de ingreso.";
		} else if((imc > 16.0) && (imc < 16.9)) {
			result = "infrapeso";
			
		} else if((imc > 17.0) && (imc < 18.4)) {
			result = "bajo peso";

		} else if((imc > 18.5) && (imc < 24.9)) {
			result = "peso normal";

		} else if((imc > 25.0) && (imc < 29.9)) {
			result = "sobrepeso";

		} else if((imc > 30.0) && (imc < 39.9)) {
			result = "obesidad premórbida";

		} else if((imc > 40.0) && (imc < 45)) {
			result = "obesidad mórbida";

		} else if(imc > 45.0) {
			result = "obesidad hipermórbida";

		} else {
			System.err.println("imc < 16.0: " + (imc < 16.0));
		}
		
		System.out.println("Con un IMC de " + imc + " fue diacnosticad@ con: " + result + "\nSu peso en Kg es: " + pesoKg);
		inp.close();
	}
}
