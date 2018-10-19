package es.cj.datos;

import java.util.Scanner;

public class Ejercicio11 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduzca un numero:");
		int num = sc.nextInt(), cont = 0, i = 0, sum = 0;
		System.out.println();

		do {
			if (i % 2 != 0) {
				cont++;
				sum = sum + i;
			}

			i++;

		} while (cont != num);
		System.out.println("La suma es " + sum);
	}

}
