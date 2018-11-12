package es.cj.ejercicios.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
	private static Scanner sc = new Scanner(System.in);
	private static int[] numeros;

	public static void main(String[] args) {
		int tamano=0;
		do {
			System.out.println("Introduzca la cantidad de numeros que desea que se muestren");
			tamano = sc.nextInt();
		} while (tamano <= 0);

		numeros = new int[tamano];

		iniciar();
		mostrarTabla();
		int pos = 0;
		do {
			System.out.println("Introduzca un valor entre 0 y " + (tamano - 1));
			pos = sc.nextInt();
		} while (pos < 0 || pos > tamano);

		borrarDesplazarTabla(pos);
		System.out.println(Arrays.toString(numeros));
	}

	private static void mostrarTabla() {
		System.out.println(Arrays.toString(numeros));

	}

	private static void iniciar() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(10) + 1;
		}
	}

	private static void borrarDesplazarTabla(int pos) {
		for (int i = pos; i < numeros.length-1; i++) {
			numeros[i] = numeros[i + 1];
		}
		numeros[numeros.length - 1] = 0;
	}
}
