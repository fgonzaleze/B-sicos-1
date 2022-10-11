package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		int num1;
		int num2;
		boolean total;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer número: ");
		num1 = sc.nextInt();
		System.out.println("Introduzca el segundo número: ");
		num2 = sc.nextInt();
		total = num1 == num2;
		System.out.println("Los números son iguales: " + total);
		
	}
}