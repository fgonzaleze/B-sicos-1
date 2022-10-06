package ejerciciosBasicos2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		boolean tareas;
		boolean llueve;
		boolean biblioteca;
		boolean salida;
		Scanner sc = new Scanner(System.in);
		System.out.println("Está lloviendo: ");
		llueve = sc.nextBoolean();
		System.out.println("Has acabado tus tareas: ");
		tareas = sc.nextBoolean();
		System.out.println("Tienes que ir a la biblioteca:");
		biblioteca = sc.nextBoolean();
		salida = !llueve && tareas || biblioteca;
		System.out.println("Puedes salir: " + salida);
		sc.close();

	}

}
