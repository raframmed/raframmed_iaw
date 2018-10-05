package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio02_Corregido {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// Pedir al usuario día, mes y año y comprobar que la fecha es correcta incluido bisiestos
		
		// fecha % 4 == 0 && fecha %100 != 0  || fecha % 400 ==0
		System.out.println("Intruduzca dia, mes y año (separado por espacios)");
		int dia = sc.nextInt();
		int mes = sc.nextInt();
		int anyo = sc.nextInt();
		boolean fechaCorrecta = false;
		
		
		if(anyo > 0) {
			boolean esbisiesto = (anyo % 4 == 0 && anyo %100 != 0)  || anyo % 400 ==0;
			if(mes >= 1 && mes <= 12) {
				switch (mes) {
				case 2:
					if(dia >=1 && dia <=29 && esbisiesto) {
						fechaCorrecta = true;
					}
					else if(dia >= 1 && dia <=28 && !esbisiesto) {
						fechaCorrecta = true;
					}
					break;
				case 1:
				case 3:
				case 5:
				case 7:
				case 8: 
				case 10:
				case 12:
					if (dia >= 1 && dia <= 31) {
						fechaCorrecta = true;
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if (dia >= 1 && dia <= 30) {
						fechaCorrecta = true;
					}
					break;
				default:
					break;
				}
			}
		}
		if(fechaCorrecta) {
			System.out.println("Fecha correcta.");
		}
		else {
			System.out.println("Fecha incorrecta.");
		}
	}
}
