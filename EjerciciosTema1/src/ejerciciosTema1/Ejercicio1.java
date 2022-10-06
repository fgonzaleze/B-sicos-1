package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int redondeado;
		double numero;
		System.out.println("Escriba un número: ");
		numero = sc.nextDouble();
		redondeado = (int) (numero + 0.5); 
		System.out.println(numero + " Redondeado es: " + redondeado);
		sc.close();
	}

}
