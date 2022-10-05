package ejerciciosBasicos2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int peras;
		int manzanas;
		final double kg;
		final double PPERAS;
		final double PMANZANAS;
		PPERAS = 1.95;
		PMANZANAS = 2.35;
		Scanner sc = new Scanner(System.in);
		System.out.print("Kilos de peras: ");
		peras = sc.nextInt();
		System.out.print("Kilos de manzanas: ");
		manzanas = sc.nextInt();
		kg = (double) (peras * PPERAS) + (manzanas + PMANZANAS);
		System.out.print("Importe total en euros: " + kg);
		

	}

}
