package es.cj.fundamentos.datos;

import java.util.Scanner;

public class EjercicioTres {
	// Pedir el radio de un circulo y calcular su área y su longitud
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Introduzca el Radio del circulo: ");
		double radio = sc.nextDouble();
		
		double longitud = Math.PI * radio * 2;
		double area = Math.PI * Math.pow(radio, 2);
		
		
		System.out.println("El Area es: " + area);
		System.out.println("El Logitud es: " + longitud);
		
		sc.close();
	}
}
