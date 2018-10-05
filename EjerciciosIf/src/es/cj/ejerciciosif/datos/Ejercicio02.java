package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio02 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// Pedir al usuario día, mes y año y comprobar que la fecha es correcta incluido bisiestos
		
		// fecha % 4 == 0 && fecha %100 != 0  || fecha % 400 ==0
		System.out.println("Intruduzca dia, mes y año (separado por espacios)");
		int dia = sc.nextInt();
		int mes = sc.nextInt();
		int anyo = sc.nextInt();
		boolean bisiesto = (anyo % 4 == 0 && anyo %100 != 0)  || anyo % 400 ==0;
		boolean salida = false;
		String bisiestoF;
		String salidaF;
		
		if(anyo > 0) {
			if(bisiesto && mes == 2 && dia == 29) {
				bisiesto = true;
				salida = true;
			}
			if(mes >= 0 && mes <= 12) {
				if(dia >= 1 && dia <= 28) {
					salida = true;
				}
			}
			else if(dia >= 1 && dia <= 30) {
				salida = true;
			}
			else if(dia >= 1 && dia <= 31){
				salida = true;
			}
			else {
				System.out.println("Datos introducidos incorrectos");
			}
		}
		if(bisiesto) {
			bisiestoF = "Correcto";
		}
		else {
			bisiestoF = "Incorrecto";
		}
		if(salida) {
			salidaF = "Correcto";
		}
		else {
			salidaF = "Incorrecto";
		}
		System.out.println("La fecha introducida es " + salidaF + " y el año bisiesto es " + bisiestoF);
	}

}
