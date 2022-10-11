package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int cm;
		double m;
		double suma;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la medida en metros: ");
		m = sc.nextDouble();
		cm = (int)  (m * 100);
		//suma = (int) cm / 0.01;
		System.out.println("La medida correspondiente en centímetros es: " + cm);
		

	}

}
