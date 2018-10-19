package es.cj.fundamentos.datos;

import java.util.Scanner;

public class EjercicioCuatro {
	// Pida al usuario una cantidad de segundos e imprima la cantidad de 
	// horas, minutos y segundos que son.
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Introduzca la cantidad en segundos ");
		int segundosT = sc.nextInt();
		
		int horas = segundosT/3600 ;
		int minutos = (segundosT%3600)/60;
		int segundos = (segundosT % 60);
		
		
		System.out.println(segundos + " son " + horas + " horas " + minutos + " minutos " + segundos + " segundos.");
		
		/*System.out.println("El Area es: " + area);
		System.out.println("El Logitud es: " + longitud);*/
		
		sc.close();

	}

}
