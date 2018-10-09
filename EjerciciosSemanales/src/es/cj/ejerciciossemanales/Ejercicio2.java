package es.cj.ejerciciossemanales;

import java.util.Scanner;
public class Ejercicio2 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduzca las horas trabajadas");
		int horas = sc.nextInt();
		int sal = 0;
		if(horas >= 0) {
			if(horas <= 40) {
				sal = horas * 16;
			}
			else {
				sal = (horas - 40) * 20;
				sal = sal + (40 * 16);
			}
			System.out.println("El salario es: " + sal);
		}
		else {
			System.out.println("Error numero introducido incorrecto.");
		}
	}

}
