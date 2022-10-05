package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int edad;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu edad: ");
		edad = sc.nextInt ();
		edad = edad + 1;
		System.out.print("El año que viene, tu edad será " + edad + " años");
		

	}

}
