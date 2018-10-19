package es.cj.datos;

import java.util.Scanner;

public class Ejercicio3 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduzca numero hasta el que desea recorrer: ");
		int num = sc.nextInt(), producto = 1, cont = 0, i = 1;

		do {
			if (i % 2 != 0) {
				producto = producto * i;
				cont++;
			}
			i++;
		} while (cont != num);

		System.out.println("El producto es: " + producto);
	}

}
