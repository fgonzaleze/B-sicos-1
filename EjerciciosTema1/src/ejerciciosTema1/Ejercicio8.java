package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		final double infantiles = 15.50;
		final double adultos = 20;
		int numInfantiles;
		int numAdultos;
		double total;
		double desc;
		double totalDesc;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número de entradas infantiles: ");
		numInfantiles = sc.nextInt();
		System.out.println("Introduzca el número de entradas adultos: ");
		numAdultos = sc.nextInt();
		total = (numInfantiles * infantiles) + (adultos * numAdultos);
		if (total >= 100) {
			desc = (total * 0.05);
			totalDesc = (total + desc);
			System.out.println("El precio total es: " + totalDesc);
		} else { 
			System.out.println("El precio total es: " + total);
		}
		sc.close();
		

	}
}