package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int n1; // el número entero que solicitaremos
		int x; // el número auxiliar
		int n2;// el segundo numero solicitado
		int suma; // la suma que será la solución final
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el primer número entero: ");
		n1 = sc.nextInt();
		System.out.println("Escriba el segundo número entero: ");
		n2 = sc.nextInt();
		// Usamos un número auxiliar y el modulo % para dos numeros enteros
		x = n1 % n2;
		// La suma será lo que mostremos, que es n2 menos el número auxiliar
		suma = n2 - x;
		System.out.println("Para que el primer número sea múltiplo del segundo tienes que sumarle: " + suma);
		sc.close();


	}

}
