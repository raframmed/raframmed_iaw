package es.cj.ejercicios.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3_beta {
	
	private static Scanner sc = new Scanner(System.in);
	private static int contPares = 0, contImpares = 0;

	
	private static int [] numeros;
	private static int [] pares;
	private static int [] impares;
	
	public static void main(String[] args) {
		int tamano;
		do {
			System.out.println("Introduzca la cantidad de numeros que desea que se muestren");
			tamano = sc.nextInt();
		}while(tamano <= 0);
		
		numeros = new int [tamano];
		pares = new int [tamano];
		impares = new int [tamano];
		
		inicializarTablaNumeros();
		
		dividirParesImpares();
		
		mostrarResultado();
		
		
	}

	private static void mostrarResultado() {
		String cadPares = "", cadImpares = "";
		for (int i = 0; i < numeros.length; i++) {
			if(i < contPares) {
				
			}
		}
		for (int i = 0; i < contPares; i++) {
			System.out.print(pares[i] + " ");
		}
		for (int i = 0; i < contImpares; i++) {
			System.out.print(impares[i] + " ");
		}
	}

	private static void dividirParesImpares() {
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				pares[contPares] = numeros[i];
				contPares++;
			}
			else {
				impares[contImpares] = numeros[i];
				contImpares++;
			}
			
		}
		
	}

	private static void inicializarTablaNumeros() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(50)+1;
		}
	}

}
