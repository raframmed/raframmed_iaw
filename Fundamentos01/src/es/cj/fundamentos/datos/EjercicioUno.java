package es.cj.fundamentos.datos;
import java.util.Scanner;

public class EjercicioUno {
	
	// Programa que realice la conversión de grados Celcius a Farenheit.
	// Los grados Celcius debe de proporcionarlos el usuario
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Grados Celcius:");
		double grados = sc.nextDouble();
		double fahrenheit = (grados * 1.8) + 32;
		System.out.println(grados + " grados celcius son: " + fahrenheit + " grados fahrenheit.");
	}
}
