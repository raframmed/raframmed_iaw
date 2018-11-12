package es.cj.ejercicios.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
	private static int tabla [];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = 0;
		do {
			System.out.println("Introduzca un tamaño para la tabla: ");
			n = sc.nextInt();
		} while (n <= 0);
		tabla = new int [n];

		incializar();

		mostrarTabla();

		ordenar();

		mostrarTabla();
	}

	private static void incializar() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(10);
		}
	}

	private static void ordenar() {
		Arrays.sort(tabla);
	}

	private static void mostrarTabla() {
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i] + "\t");
		}
		System.out.println();
	}

}
