package es.cj.ejercicios.datos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int tabla1[];
	private static int tabla2[];
	private static int tabla3[];
	
	public static void main(String[] args) {
		System.out.println("Introduzca la cantidad de numeros que desea que se muestren");
		int n = sc.nextInt();
		tabla1 = new int [n];
		tabla2 = new int [n];
		tabla3 = new int [n+n];
		
		inicialiar();
		
		mezclarTablas();
		
		mostrarTabla();
		
	}
	private static void mostrarTabla() {
		System.out.println(Arrays.toString(tabla1));
		System.out.println(Arrays.toString(tabla2));
		System.out.println(Arrays.toString(tabla3));
	}
	private static void mezclarTablas() {
		for (int i = 0; i < tabla3.length; i+=2) {
			for (int j = 0; j < tabla2.length; j++) {
				tabla3[i] = tabla1[j];
				tabla3[i+1] = tabla2[j];
			}	
		}	
	}
	private static void inicialiar() {
		for (int i = 0; i < tabla1.length; i++) {
			tabla1[i] = i+1;
		}
		for (int i = 0; i < tabla2.length; i++) {
			tabla2[i] = i+1;
		}
	}

}
