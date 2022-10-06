package ejerciciosBasicos2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int peras; //En esta variable indico los kilos de las peras 
		int manzanas; //En esta variable indicamos los kilos de las manzanas
		double kg; //En esta variable añadimos double para indicar el importe total
		final double PPERAS = 1.95;
		final double PMANZANAS = 2.35;
		Scanner sc = new Scanner(System.in);
		System.out.print("Kilos de peras: ");
		peras = sc.nextInt();
		System.out.print("Kilos de manzanas: ");
		manzanas = sc.nextInt();
		kg = (double) (peras * PPERAS) + (manzanas + PMANZANAS); 
		System.out.print("Importe total en euros: " + kg);
		sc.close();

	}

}
