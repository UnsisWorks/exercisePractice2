package condicionales;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		Scanner inpStr = new Scanner(System.in);
		float totalSeg;
		System.out.println("");
		
		System.out.print("Horas: ");
		float horas = inp.nextFloat();
		
		System.out.print("Minutos: ");
		float min = inp.nextFloat();
		
		System.out.print("Segundos: ");
		float seg = inp.nextFloat();
		
		System.out.print("AM/PM: ");
		String form = inpStr.nextLine();

		form = form.toLowerCase();
		
		if (form.equals("am")) {
			totalSeg = (float)(horas*3600);
			totalSeg += (float)(min*60);
			totalSeg += seg;
			
			System.out.println("El total de segundos del dia es: " + totalSeg);
		} else if (form.equals("pm")) {
			totalSeg = (float)((horas + 12)*3600);
			totalSeg += (float)(min*60);
			totalSeg += seg;
			System.out.println("El total de segundos del dia es: " + totalSeg);

		} else {
			System.err.println("Error de formato");
		}
		
		inp.close();
		inpStr.close();
	}
}














