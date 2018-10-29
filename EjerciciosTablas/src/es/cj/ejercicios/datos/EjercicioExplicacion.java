package es.cj.ejercicios.datos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class EjercicioExplicacion {
	
	public static void main(String[] args) {
/*		
		int tabla [][] = new int [10][10];
		
		tabla[1][2] = 3;
		
		double tabla2 [] = {1,2,3};
		
		int tabla3 [][] = {{1,2,3},{4,5},{6,7,8,9}};
		for (int i = 0; i < tabla3.length; i++) {
			for (int j = 0; j < tabla3[i].length; j++) {
				System.out.print(tabla3[i][j]+ " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < tabla2.length; i++) {
			System.out.println(tabla2[i]+" ");
		}
		for (int i = 0; i < tabla2.length; i++) {
			tabla2[i] = tabla2[i] * tabla2[i];
		}
		for (int i = 0; i < tabla2.length; i++) {
			System.out.println(tabla2[i]+" ");
		}
		
		String cadena [] = {"Hola","que","tal"};
		for (int i = 0; i < cadena.length; i++) {
			System.out.println(cadena[i]+ " ");
			
		}
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				tabla[i][j] = new Random().nextInt(100);
				
			}
			
		}
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				System.out.print(tabla[i][j] + " ");
				
			}
			System.out.println();
		}
*/
		int [] numeros = new int [10];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(10);
		}
		
		System.out.println(Arrays.toString(numeros));
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		System.out.println("El 6 se encuentra en la posición: "+ Arrays.binarySearch(numeros, 6));
		
		Arrays.fill(numeros, 99);
		System.out.println(Arrays.toString(numeros));
		
		int [] auxiliar = Arrays.copyOfRange(numeros, 0, 5);
		System.out.println(Arrays.toString(auxiliar));
		
		
	}

}