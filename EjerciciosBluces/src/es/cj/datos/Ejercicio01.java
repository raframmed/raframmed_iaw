package es.cj.datos;

import java.util.Scanner;

public class Ejercicio01 {
	private static Scanner sc = new Scanner(System.in); 

	public static void main(String[] args) {
		// Pedir 5 numeros, mostrar la media de los positivos, media negativos y cantidad de ceros.
		double sumaPostivos = 0, sumaNegativos = 0;
		int contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Numero: ");
			double numero = sc.nextDouble();
			
			if(numero > 0) {
				sumaPostivos = sumaPostivos + numero;
				contadorPositivos++;
			}
			else if(numero < 0) {
				sumaNegativos += numero;
				contadorNegativos++;
			}
			else {
				contadorCeros++;
			}
		}
		System.out.println("Media positivos: " + sumaPostivos / contadorPositivos);
		System.out.println("Media negativos: " + sumaNegativos / contadorNegativos);
		System.out.println("Numero de ceros: " + contadorCeros);
		sc.close();
	}

}
