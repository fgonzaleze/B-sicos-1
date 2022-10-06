package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double area;
		double base;
		double altura;
		System.out.println("Introduzca la base del triángulo: ");
		base = sc.nextDouble();
		System.out.println("Inroduzca la altura del triángulo: ");
		altura = sc.nextDouble();
		area = (base * altura) / 2;
		System.out.println("El área del triángulo es: " + area);
		sc.close();

	}

}
