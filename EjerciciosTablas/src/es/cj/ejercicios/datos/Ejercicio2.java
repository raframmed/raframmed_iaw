package es.cj.ejercicios.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduzca la cantidad de numeros que desea que se muestren");
		int n = sc.nextInt();
		int orden [] = new int [n];
		
		for (int i = 0; i < orden.length; i++) {
			orden[i] = new Random().nextInt(10);
		}
		Arrays.sort(orden);
		System.out.println("Que numero desea comprobar si se encuentra?");
		int buscado = sc.nextInt();
		int encontrado = Arrays.binarySearch(orden, buscado);
		System.out.println(Arrays.toString(orden));
		if(encontrado > 0) {
			System.out.println("El numero se encuentra en la posición: " + encontrado);
		}
		else{
			System.out.println("No existe el numero buscado");
		}
		
	}

}
