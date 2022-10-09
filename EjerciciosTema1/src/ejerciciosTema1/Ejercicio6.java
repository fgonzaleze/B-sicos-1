package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Necesitamos los segundos, las horas y los minutos
		int minuto;
		int hora;
		int segundos;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba la cantidad de segundos que quieres calcular: ");
		segundos = sc.nextInt();
		hora = segundos/3600; //Las horas son los segundos entre 3600 que dura una hora
		// Hacemos la operacion con el resto que nos sobró de la hora
		minuto = ((segundos - (hora*3600))/60); 
		// Repetimos lo mismo con el resto de la hora y de los minutos, que sumamos par aobtener los segundos restantes
		segundos = (segundos - ((hora*3600) + (minuto*60)));
		System.out.println("Horas: " + hora);
		System.out.println("Minutos: " + minuto);
		System.out.println("Segundos: " + segundos);
		
		sc.close();

	}

}
