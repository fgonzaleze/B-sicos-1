package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int n1, n2;
		double media;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nota 1: ");
		n1 = sc.nextInt();
		System.out.print("Nota 2: ");
		n2 = sc.nextInt();
		media = (double)(n1 + n2)/2;
		System.out.print("Nota media:" + media);
		

	}

}
