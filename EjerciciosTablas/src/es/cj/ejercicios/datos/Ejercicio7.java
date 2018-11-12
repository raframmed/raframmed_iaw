package es.cj.ejercicios.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
	private static Scanner sc = new Scanner(System.in);
	private static int alumnos[][];
	private static double mediasT[];
	private static double mediasA[];

	public static void main(String[] args) {
		int numAlumnos = 0;
		do {
			System.out.println("Nº alumnos: ");
			numAlumnos = sc.nextInt();
		} while (numAlumnos <= 0);

		int trimestres = 0;
		do {
			System.out.println("Nº Trimestres: ");
			trimestres = sc.nextInt();
		} while (trimestres <= 0);

		alumnos = new int[numAlumnos][trimestres];
		mediasT = new double[alumnos[0].length];
		mediasA = new double[alumnos.length];

		iniciar();
		mostrarNotas();
		calcularMedias();
		mostrarMedias();
	}

	private static void mostrarMedias() {
		System.out.println("--- MEDIAS ---");
		System.out.println("Media alumnos" + Arrays.toString(mediasA));
		System.out.println("Media trimestres" + Arrays.toString(mediasT));
	}

	private static void calcularMedias() {
		for (int i = 0; i < alumnos.length; i++) {
			for (int j = 0; j < alumnos[i].length; j++) {
				mediasT[j] += alumnos[i][j];
				mediasA[i] += alumnos[i][j];
			}
			mediasA[i] = Math.rint((mediasA[i] / mediasT.length) * 100) / 100;
		}
		calcularMediasTrimestre();
	}

	private static void calcularMediasTrimestre() {
		for (int i = 0; i < mediasT.length; i++) {
			mediasT[i] = Math.rint((mediasT[i] / mediasA.length) * 100) / 100;
		}
	}

	private static void mostrarNotas() {
		System.out.println("--- NOTAS ---");
		for (int i = 0; i < alumnos.length; i++) {
			for (int j = 0; j < alumnos[i].length; j++) {
				System.out.print(alumnos[i][j] + "\t");
			}
			System.out.println("");
		}
	}

	private static void iniciar() {
		for (int i = 0; i < alumnos.length; i++) {
			for (int j = 0; j < alumnos[i].length; j++) {
				alumnos[i][j] = new Random().nextInt(11);
			}
		}
	}

}
