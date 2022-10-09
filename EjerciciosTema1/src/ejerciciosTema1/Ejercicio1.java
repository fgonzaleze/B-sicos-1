package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int redondeado; // Añadimos int para usarla en el número redondeado
		double numero; // Usamos double para el número que vamos a pedir, ya que contará con decimales
		System.out.println("Escriba un número: ");
		numero = sc.nextDouble();
		// Aquí lo que hacemos es sumarle 0.5, ya que si el número tiene un decimal superior a 0.5 pasará a ser el siguiente número y 
		// al quitarle el decimal con (int) en la cuenta, se redondeará. 
		redondeado = (int) (numero + 0.5);  
		System.out.println(numero + " Redondeado es: " + redondeado);
		sc.close();
	}

}
