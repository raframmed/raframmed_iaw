package es.cj.ejerciciossemanales;

import java.util.Scanner;

public class Ejercicio3 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduzca un numero");
		int num = sc.nextInt(), suma = 0;
		
		suma = abundante(num);
		
		if(suma > num) {
			System.out.println("El numero es abundante");
		}
		else {
			System.out.println("El numero no es abundante");
		}
		sc.close();
	}
	private static int abundante(int num) {
		int suma = 0;
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				suma+=i;
			}	
		}
		return suma;
		
	}

}
