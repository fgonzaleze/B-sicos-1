package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Vamos a pedir los números que necesitamos a través del Scanner
		int a;
		int b;
		int c;
		int d;
		int x;
		int y;
		System.out.println("Introduzca el valor de a: ");
		a = sc.nextInt();
		System.out.println("Introduzca el valor de b: ");
		b = sc.nextInt();
		System.out.println("Introduzca el valor de c: ");
		c = sc.nextInt();
		System.out.println("Introduzca el valor de d: ");
		d = sc.nextInt();
		System.out.println("Introduzca el valor de x: ");
		x = sc.nextInt();
		// Una vez obtenidos los números que necesitamos para resolver el polinomio, despejamos la y con las siguientes cuentas
		y = a*x*x + b*x + c;
		System.out.println("El valor correspondiente de y para y=ax^2+bx+c, es igual a: " + y);

	}

}
