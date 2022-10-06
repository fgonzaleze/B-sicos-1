package ejerciciosBasicos2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int nota1;
		int nota2;
		int nota3;
		int mediaBo;
		double mediaEx;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nota 1: ");
		nota1 = sc.nextInt();
		System.out.print("Nota 2: ");
		nota2 = sc.nextInt();
		System.out.print("Nota 3: ");
		nota3 = sc.nextInt();
		mediaEx = (double) (nota1 + nota2 + nota3) / 3;
		mediaBo = (nota1 + nota2 + nota3) / 3;
		System.out.println("Nota media boletín de calificaciones:" + mediaBo);
		System.out.println("Nota media expediente académico:" +mediaEx);

	}

}
