package es.cj.datos;

import java.util.Scanner;

public class Ejercicio10 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduzca dos numeros: ");
		int num1 = sc.nextInt(), num2 = sc.nextInt(), suma1 = 0, suma2 = 0;
		for(int i = 1; i < num1; i++) {
			if(num1 % i == 0) {
				suma1+=i;
			}	
		}
		for(int i = 1; i < num2; i++) {
			if(num2 % i == 0) {
				suma2+=i;
			}	
		}
		if(suma1 == num2 && suma2 == num1) {
			System.out.println("Son amigos.");
		}
		else {
			System.out.println("No son amigos");
		}
		
		sc.close();
	}

}