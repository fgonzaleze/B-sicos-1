package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int ent; // el número entero que solicitaremos
		int n1; // el numero auxiliar
		int suma; // la suma que será la solución final
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el número entero: ");
		ent = sc.nextInt();
		// Usamos un número auxiliar y el modulo % para dos numeros enteros
		n1 = ent % 7;
		// La suma será lo que mostremos, que es 7 menos el número auxiliar
		suma = 7 - n1;
		System.out.println("Para que el número sea múltiplo de 7 tienes que sumarle: " + suma);
		sc.close();

	}

}
