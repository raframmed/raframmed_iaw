package es.cj.ejerciciossemanales;

import java.util.Scanner;

public class Ejercicio1 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduzca un numero postivio de una a cuatro cifras");
		int num1 = sc.nextInt();
		if(num1 <= 0) {
			System.out.println("Error numero negativo");
		}
		else {
			if(num1 >= 1 && num1 < 10) {
				System.out.println("El numero introducido tiene una cifra");
			}
			else if(num1 >= 10 && num1 < 100) {
				System.out.println("El numero introducido tiene dos cifras");
			}
			else if(num1 >= 100 && num1 < 1000) {
				System.out.println("El numero introducido tiene tres cifras");
			}
			else if(num1 >= 1000 && num1 < 10000) {
				System.out.println("El numero introducido tiene cuatro cifras");
			}
			else {
				System.out.println("El numero introducido tiene mas de cuatro cifras");
			}
		}
	}

}
