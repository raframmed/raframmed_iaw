package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Explicaciones {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Pedir dos números y comprobar si son iguales
		
		//Primera forma
		System.out.println("Nº 1:");
		int num1 = sc.nextInt();
		
		System.out.println("Nº 2:");
		int num2 = sc.nextInt();
		/*
		if(num1 == num2) {
			System.out.println(num1 + " es igual a " + num2);
		} else {
			System.out.println(num1 + " no es igual a " + num2);
		}
		
		boolean condicion = num1 == num2;
		
		//Segunda forma
		if(condicion)
			System.out.println(num1 + " es igual a " + num2);
		else
			System.out.println(num1 + " no es igual a " + num2);

		//Segunda forma
		if(!condicion)
			System.out.println(num1 + " no es igual a " + num2);
		else
			System.out.println(num1 + " es igual a " + num2);

		// Pedir un numero e indicar si es positivo, negativo o cero
		if(num1 > 0) {
			System.out.println(num1 + " es mayor que 0");
		}
		else if(num1 < 0) {
			System.out.println(num1 + " es menos que 0");
		}
		else {
			System.out.println(num1 + " es igual que 0");
		}
		
		// Pedir 2 numeros y decir si uno es multiplo del otro
		if(num1 % num2 == 0) {
			System.out.println(num1 + " es múltiplo de " + num2);
		}
		else if(num1 % num2 == 0) {
			System.out.println(num1 + " no es múltiplo de " + num2);
		}
		else{
			System.out.println("No son múltiplos");
		}
		
		// Pedir 2 numeros e indicar cual es el mayor o si son iguales
		
		if(num1 > num2)
			System.out.println(num1 + " es mayor que " + num2);
		else if (num2 > num1)
			System.out.println(num2 + " es mayor que " + num2);
		else
			System.out.println(num1 + " es igual que " + num2);
		*/
		// Pedir 3 numeros y mostrarlos ordenados 
		System.out.println("Nº 3:");
		int num3 = sc.nextInt();
		if(num1 > num2 && num1 > num3) {
			
			if(num2 > num3) {
				System.out.println("el orden correcto es: " + num1  + " " + num2  + " " + num3);
			}
			else {
				System.out.println("el orden correcto es: " + num1  + " " + num3  + " " + num2);
			}
		}
		else if(num2 > num1 && num2 > num3) {
			if(num1 > num3) {
				System.out.println("el orden correcto es: " + num2  + " " + num1  + " " + num3);
			}
			else {
				System.out.println("el orden correcto es: " + num2  + " " + num3  + " " + num1);
			}
		}
		else {
			
			if(num1 > num2) {
				System.out.println("el orden correcto es: " + num3 + " " + num1  + " " + num2);
			}
			else {
				System.out.println("el orden correcto es: " + num3  + " " + num2  + " " + num1);
			}
			
		}
		
		sc.close();
	}

}
