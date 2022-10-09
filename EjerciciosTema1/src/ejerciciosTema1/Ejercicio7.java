package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		double mm;
		double cm;
		double m;
		double suma;
		Scanner sc = new Scanner(System.in);
		System.out.println("Primera medida en milímetros: ");
		mm = sc.nextDouble();
		System.out.println("Primera medida en centímetros: ");
		cm = sc.nextDouble();
		System.out.println("Primera medida en metros: ");
		m = sc.nextDouble();
		suma = (mm*0.01)  + cm + (m/0.01);
		System.out.println("La suma de las tres longitudes introducidas en centímetros es: " +suma);
		sc.close();
	}

}
