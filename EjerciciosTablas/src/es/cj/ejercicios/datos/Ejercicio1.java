package es.cj.ejercicios.datos;

import java.util.Scanner;

public class Ejercicio1 {
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduzca un numero de enteros a introducir");
		int n = sc.nextInt(), cont_ceros = 0;
		double positivos = 0, negativos = 0, cont_positivos = 0, cont_negativos = 0;
		int tabla [] = new int [n];
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un valor: ");
			tabla[i] = sc.nextInt();
			if(tabla[i] < 0) {
				negativos += tabla[i];
				cont_negativos++;
			}
			else if(tabla[i] > 0) {
				positivos += tabla[i];
				cont_positivos++;
			}
			else {
				cont_ceros++;
			}
		}
		System.out.println("La media de positivos es: " + positivos/cont_positivos);
		System.out.println("La media de positivos es: " + negativos/cont_negativos);
		System.out.println("La cantidad de ceros es: " + cont_ceros); 

	}

}
