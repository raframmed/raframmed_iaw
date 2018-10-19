package es.cj.datos;

import java.util.Scanner;

public class Ejercicio7 {
	// Pida un n�mero al usuario e indique cu�ntos n�meros primos hay entre 1 y el
	// n�mero

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num = 0;
		do {
			System.out.println("Introduzca un numero: ");
			num = sc.nextInt();
		} while (num < 1);

		long inicio = System.currentTimeMillis();
		int cont = 0;

		for (int i = 2; i < num; i++) {
			if (esPrimo(i)) {
				cont++;
			}
		}
		long fin = System.currentTimeMillis();

		System.out.println("La cantidad de numeros primos entre 1 y " + num + " es de " + cont);

		System.out.println("Tiempo:" + (fin - inicio) + "ms");
		sc.close();
	}

	private static boolean esPrimo(int num) {
		boolean primo = true;
		for (int j = 2; j < num && primo; j++) {
			if (num % j == 0) {
				primo = false;
			}
		}
		return primo;
	}

}
