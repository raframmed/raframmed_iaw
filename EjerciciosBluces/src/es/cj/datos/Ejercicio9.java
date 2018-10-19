package es.cj.datos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {
	// Leer por teclado una serie de n números. La aplicación debe indicarnos si los
	// números están ordenados de forma creciente, decreciente o si no están
	// ordenados

	private static Scanner sc = new Scanner(System.in);

	public static int comprobarOrden(int cant) {
		int ordenado = 0;
		boolean creciente = false, decreciente = false;
		int numero = 0, auxiliar = 0;
		for (int i = 0; i < cant; i++) {
			numero = new Random().nextInt(100);
			System.out.print(numero + " ");

			if (i == 0) {
				auxiliar = numero;
			} else {
				if (numero >= auxiliar) {
					creciente = true;
				} else {
					decreciente = true;
				}
				auxiliar = numero;
			}
		}
		if (creciente && !decreciente) {
			ordenado = 1;
		} else if (decreciente && !creciente) {
			ordenado = -1;
		}

		return ordenado;
	}

	public static void main(String[] args) {
		int cantidad = 0;
		do {
			System.out.println("Cantidad de numeros: ");
			cantidad = sc.nextInt();
		} while (cantidad <= 0);

		// 1:Creciente
		// -1:Decreciente
		// 0:Desordenado
		int orden = comprobarOrden(cantidad);

		switch (orden) {
		case 1:
			System.out.println("Creciente");
			break;
		case -1:
			System.out.println("Decreciente");
			break;
		default:
			System.out.println("Desordenado");
			break;
		}

		sc.close();
	}

}
