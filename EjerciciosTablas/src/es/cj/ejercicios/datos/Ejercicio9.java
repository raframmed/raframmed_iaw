package es.cj.ejercicios.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {

	private static Scanner sc = new Scanner(System.in);

	private static int tabla1[];
	private static int tabla2[];
	private static int tablaFusion[];

	public static void main(String[] args) {
		int tamano = 0;
		do {
			System.out.println("Introduzca el tamaño de las tablas:");
			tamano = sc.nextInt();
		} while (tamano <= 0);

		tabla1 = new int[tamano];
		tabla2 = new int[tamano];
		tablaFusion = new int[tamano * 2];

		// Inicializar las tablas
		inicializarTablas();
		
		// Mostrar tablas
		mostrarTablas();
		
		// Ordenar tablas
		ordenarTablas();
		
		System.out.println("\n");
		
		// Mostrar tablas
		mostrarTablas();
		
		// Fusionar tablas
		fusionarTablas();
	}

	private static void fusionarTablas() {
		for (int i = 0; i < tabla1.length; i++) {
			if(tabla1[i] == tabla2[i]) {
				tablaFusion[i] = tabla1[i];
				tablaFusion[i] = tabla2[i];
			}
		}
	}

	private static void mostrarTablas() {
		for (int i = 0; i < tabla1.length; i++) {
			System.out.print(tabla1[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < tabla1.length; i++) {
			System.out.print(tabla2[i] + "\t");
		}
		
	}

	private static void ordenarTablas() {
		Arrays.sort(tabla1);
		Arrays.sort(tabla2);
	}
	private static void inicializarTablas() {
		for (int i = 0; i < tabla1.length; i++) {
			tabla1[i] = new Random().nextInt(10) + 1;
			tabla2[i] = new Random().nextInt(10) + 1;
		}
	}
}
