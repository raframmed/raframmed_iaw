package es.cj.ejercicioscadenas.datos;

import java.util.Scanner;

public class Ejercicio4 {

	private static Scanner sc = new Scanner(System.in);
	private static String cadena;
	public static void main(String[] args) {
		do {
			System.out.println("Introduzca la cadena: ");
			cadena = sc.nextLine();
		}while(cadena.length() == 0);
		
		char [] caracter = cadena.toCharArray();
		int suma = 0;
		for (int i = 0; i < caracter.length; i++) {
			
			if(caracter[i] >= 48 && caracter[i] <= 57) {
				suma = suma + Integer.parseInt(String.valueOf(caracter[i]));
			}
		}
		System.out.println(suma);
	}

}
