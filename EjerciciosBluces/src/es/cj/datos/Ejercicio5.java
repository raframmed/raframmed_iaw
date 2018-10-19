package es.cj.datos;

import java.util.Scanner;

public class Ejercicio5 {
	// Pedir un número y calcular su factorial
	private static Scanner sc = new Scanner(System.in);

	public static int factorial(int num) {
		int factorial;
		if(num == 0) {
			factorial = 1;
		}
		else {
			factorial = num * factorial(num-1);
		}
		return factorial;
	}

	public static void main(String[] args) {
		
		System.out.println("Introduzca un numero: ");
		int num = sc.nextInt();
		

		System.out.println(factorial(num));
		
		sc.close();
	}

}
