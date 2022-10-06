package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		final int n1 = 7;
		int n2;
		int resto; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el número entero: ");
		n2 = sc.nextInt();
		resto = n1%n2 == 0;

	}

}
