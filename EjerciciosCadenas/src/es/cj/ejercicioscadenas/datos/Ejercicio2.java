package es.cj.ejercicioscadenas.datos;

import java.util.Scanner;

public class Ejercicio2 {

	private static Scanner sc = new Scanner(System.in);
	
	private static String cadena1;
	private static String cadena2;
	
	public static void main(String[] args) {
		
		do {
			System.out.println("Introduzca las cadenas");
			cadena1 = sc.nextLine();
		}while(cadena1.length() == 0);
		
		do {
			System.out.println("Introduzca las cadenas");
			cadena2 = sc.nextLine();
		}while(cadena2.length() == 0);
		
		System.out.println(buscarycontar());
		
		sc.close();
	}

	private static int buscarycontar() {
		int cont = 0;
		int pos = cadena2.indexOf(cadena1);
			while(pos != -1) {
				cont++;
				pos = cadena2.indexOf(cadena1, pos+1);	
			}

		return cont;
	}

}
