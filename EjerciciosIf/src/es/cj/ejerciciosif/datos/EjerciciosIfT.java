package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class EjerciciosIfT {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		// 1. Pedir dos números y decir si son iguales o no
		System.out.println("Introduzca 2 numeros: ");
		Double num1 = sc.nextDouble();
		Double num2 = sc.nextDouble();
		
		if(num1 == num2) {
			System.out.println("Los numeros son iguales");
		}
		else {
			System.out.println("Los numeros no son iguales");
		}
		
		// 2. Pedir un número e indicar si es positivo o negativo
		System.out.println("Introduzca un numero: ");
		Double num3 = sc.nextDouble();
		
		if(num3 > 0) {
			System.out.println("El numero es positivo");
		}
		else if(num3 < 0) {
			System.out.println("El numero es negativo");
		}
		else {
			System.out.println("El numero introducido es 0");
		}
		
		// 3. Pedir dos números y decir si uno es múltiplo del otro
		System.out.println("Introduzca dos numeros: ");
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();

		
		if(num4 % num5 == 0) {
			System.out.println(num5 + " es multiplo de " + num4);
		}
		else {
			System.out.println(num5 + " no es multiplo de " + num4);
		}
		
		// 4. Pedir dos números e indicar cual es el mayor o si son iguales
		System.out.println("Introduzca dos numeros: ");
		Double num6 = sc.nextDouble();
		Double num7 = sc.nextDouble();

		
		if(num6 > num7) {
			System.out.println(num6 + " es mayor que " + num7);
		}
		else if(num7 > num6) {
			System.out.println(num7 + " es mayor que " + num6);
		}
		else {
			System.out.println("Los numeros introducidos son iguales");
		}
		
		
		// 5. Pedir dos números y mostrarlos ordenados de mayor a menor
		System.out.println("Introduzca dos numeros: ");
		Double num8 = sc.nextDouble();
		Double num9 = sc.nextDouble();
		
		if(num8 > num9) {
			System.out.println(num8 + " " + num9);
		}
		else {
			System.out.println(num9 + " " + num8);
		}
		
		
		// 6. Pedir tres números y mostrarlos ordenados de mayor a menor
		
		System.out.println("Introduzca tres numeros:");
		int num10 = sc.nextInt();
		int num11 = sc.nextInt();
		int num12 = sc.nextInt();
		
		if(num10 > num11 && num10 > num12) {
			
			if(num11 > num12) {
				System.out.println("el orden correcto es: " + num10  + " " + num11  + " " + num12);
			}
			else {
				System.out.println("el orden correcto es: " + num10  + " " + num12  + " " + num11);
			}
		}
		else if(num11 > num10 && num11 > num12) {
			if(num10 > num12) {
				System.out.println("el orden correcto es: " + num11  + " " + num10  + " " + num12);
			}
			else {
				System.out.println("el orden correcto es: " + num11  + " " + num12  + " " + num10);
			}
		}
		else {
			
			if(num10 > num11) {
				System.out.println("el orden correcto es: " + num12 + " " + num10  + " " + num11);
			}
			else {
				System.out.println("el orden correcto es: " + num12  + " " + num11  + " " + num10);
			}
			
		}
		
		
		// 7. Introduzca una nota de 0 a 10 y mostrarla de la forma: insuficiente, suficiente, bien...
		
		System.out.println("Introduzca la nota: ");
		double nota = sc.nextDouble();
		
		switch ((int)nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5: System.out.println("Suficiente");
			break;
		case 6: System.out.println("Bien");
			break;
		case 7:
		case 8: System.out.println("Notable");
			break;
		case 9:
		case 10: System.out.println("Sobresaliente");
			break;
		default: System.out.println("Valor incorrecto");
			break;
		}
		
		
		// 8. Pida al usuario día, mes y año y compruebe que la fecha es correcta
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
		
		
		// 9. Pedir día, mes y año y mostrar la fecha del día siguiente. 
		// 	  Suponer que todos los meses son de 30 días
		System.out.println("Intruduzca dia, mes y año (separado por espacios)");
		int dia9 = sc.nextInt();
		int mes9 = sc.nextInt();
		int anyo9 = sc.nextInt();
		
		
		if(mes9 == 12 && dia9 == 30) {
			anyo9 = anyo9 + 1;
			mes9 = 1;
			dia9 = 1;
		}
		else if(dia9 == 30) {
			dia9 = 1;
			mes9 = mes9 + 1;
		}
		else {
			dia9++;
		}
		System.out.println(dia9 + "/" + mes9 + "/" + anyo9);
		*/
		
		// 10. 
		sc.close();
	}

}
