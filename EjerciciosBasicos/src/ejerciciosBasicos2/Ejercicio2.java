package ejerciciosBasicos2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Cual es tu edad: ");
	int edad = sc.nextInt();//Introducimos aqui nuestra edad
	boolean n = edad >= 18;// aquí calculamos que n es la mayoria de edad y si es igual o mayor a 18 es true
	System.out.println("Mayor de edad:" + n);
	sc.close();
	
	
	

	}

}
