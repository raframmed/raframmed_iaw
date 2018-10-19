package es.cj.datos;

import java.util.Scanner;

public class Ejercicio4 {
	//Escribir un programa que lea un número desde el teclado y realice la suma de los 100 números siguientes, mostrando el resultado en pantalla

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduzca un numero: ");
		int num = sc.nextInt(), cont = 0;
		
		for(int i = num; i <= num+100; i++) {
			cont += i;
		}
		System.out.print(cont);
		
		sc.close();
	}

}
