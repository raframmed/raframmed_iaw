package es.cj.ejercicios.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	private static Scanner sc = new Scanner(System.in);
	
	private static int [] numeros;

	public static void main(String[] args) {
		int tamano;
		do {
			System.out.println("Introduzca la cantidad de numeros que desea que se muestren");
			tamano = sc.nextInt();
		}while(tamano <= 0);
		
		numeros = new int [tamano];
		
		iniciar();
		
		mostrar();
		
		desplazar();
		
		mostrar();
	}

	private static void desplazar() {
		int aux = numeros[numeros.length-1];
		for (int i = numeros.length - 1; i > 0; i--) {
			numeros[i] = numeros[i-1];
		}
		numeros[0] = aux;
	}

	private static void mostrar() {
		System.out.println(Arrays.toString(numeros));
	}

	private static void iniciar() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(50) + 1;
		}
	}

}
