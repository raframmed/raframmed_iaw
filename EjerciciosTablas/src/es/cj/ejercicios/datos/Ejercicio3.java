package es.cj.ejercicios.datos;

import java.util.Scanner;

public class Ejercicio3 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduzca la cantidad de numeros que desea que se muestren");
		int n = sc.nextInt();
		int nums [] = new int [n];
		int nPares = 0, nImpares = 0;
		int pares[] = new int [n];
		int impares[] = new int [n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		for (int i = 0; i < nums.length; i++) {
			
			if(nums[i] % 2 == 0) {
				pares[nPares] = nums[i];
				nPares++;
			}
			else if(nums[i] % 2 != 0){
				
				impares[nImpares] = nums[i];
				nImpares++;
			}
		}
		System.out.print("La tabla de numeros pares es: ");
		for (int i = 0; i < nPares; i++) {
			System.out.print(pares[i] + " ");
		}
		System.out.println(" ");

		System.out.print("La tabla de numeros impares es: ");

		for (int i = 0; i < nImpares; i++) {
			System.out.print(impares[i] + " ");
		}
		sc.close();
	}
}
