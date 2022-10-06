package ejerciciosBasicos2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un número para saber si es par: ");
		numero = sc.nextInt();
		boolean par = ( numero % 2 ) == 0;
		System.out.println("Es par: " + par);
		sc.close();
		

	}

}
