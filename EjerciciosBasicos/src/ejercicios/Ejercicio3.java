package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int aNacimiento;
		int aActual;
		int edad;
		Scanner sc = new Scanner(System.in);
		System.out.print("Año de nacimiento: ");
		aNacimiento = sc.nextInt();
		System.out.print("Año actual: ");
		aActual = sc.nextInt();
		edad = aActual - aNacimiento;
		System.out.print("Su edad es: " + edad + " años");
		

	}

}
