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
		
		
		// 10. Pedir el día, mes y año y mostrar la fecha del día siguiente. Con meses de 28, 30 y 31 días. Sin años bisiestos.
		System.out.println("Intruduzca dia, mes y año (separado por espacios)");
		int dia10 = sc.nextInt();
		int mes10 = sc.nextInt();
		int anyo10 = sc.nextInt();
		
		if(dia10 <= 31 && dia10 > 0) {
			if(dia10 >= 28 && mes10 == 2) {
				if(dia10 >= 29) {
					System.out.println("Error, no existe dia 29 en el mes 2");
				}
				else {
					mes10++;
					dia10 = 1;
				}
			}
			else if((mes10 == 4 || mes10 == 6 || mes10 == 9 || mes10 == 11) && dia10 == 30) {
				mes10++;
				dia10 = 1;
			}
			else if((mes10 == 1 || mes10 == 3 || mes10 == 5 || mes10 == 7 || mes10 == 8 || mes10 == 10) && dia10 == 31){
				mes10++;
				dia10 = 1;
			}
			else if (mes10 == 12 && dia10 == 31) {
				dia10 = 1;
				mes10 = 1;
				anyo10++;
			}
			else {
				dia10++;
			}
			System.out.println(dia10 + "/" + mes10 + "/" + anyo10);
		}
		else {
			System.out.println("Error el dia introducido es superior al dia 31 o inferior a 0");
		}
		
		
		// 11. Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente.
		System.out.println("Intruduzca horas, minutos y segundos (separado por espacios)");
		int hora = sc.nextInt();
		int min = sc.nextInt();
		int seg = sc.nextInt();
		
		if(min > 0 && seg > 0 && hora > 0) {
			if(seg >= 0 && seg == 59 && min >=0 && min < 59) {
				seg = 0;
				min++;
			}
			else if(seg >= 0 && seg == 59 && min >=0 && min == 59) {
				seg = 0;
				min = 0;
				hora++;
			}
			else {
				seg++;
			}
			System.out.println(hora + ":" + min + ":" + seg);
		}
		else {
			System.out.println("El valor introducido es incorrecto");
		}

		
		// 12. Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30 días.
		System.out.println("Intruduzca la primera fecha en formato dia, mes y año (separado por espacios)");
		int dia1 = sc.nextInt();
		int mes1 = sc.nextInt();
		int anyo1 = sc.nextInt();
		System.out.println("Intruduzca la primera fecha en formato dia, mes y año (separado por espacios)");
		int dia2 = sc.nextInt();
		int mes2 = sc.nextInt();
		int anyo2 = sc.nextInt();
		int diaT, mesT, anyoT;
		
		if(((anyo1 > 0) && (anyo2 > 0)) && ((mes1 > 0 && mes1 <= 12) && (mes2 > 0 && mes2 <= 12)) && ((dia1 > 0 && dia1 <= 30) && (dia2 > 0 && dia2 <= 30))) {
			if (anyo1 == anyo2) {
				if(mes1 == mes2) {
					if(dia1 > dia2) {
						diaT  = dia1 - dia2;
					}
					else {
						diaT  = dia2 - dia1;
					}
				}
				else {
					if(mes1 > mes2) {
						mesT = mes1 - mes2;
						if(dia1 > dia2) {
							diaT  = dia1 - dia2;
						}
						else {
							diaT  = dia2 - dia1;
						}
						diaT = diaT + (mesT * 30);
					}
					else {
						mesT = mes2 - mes1;
						if(dia1 > dia2) {
							diaT  = dia1 - dia2;
						}
						else {
							diaT  = dia2 - dia1;
						}
						diaT = diaT + (mesT * 30);
					}
				}
			}
			else {
				if(anyo1 > anyo2) {
					anyoT = anyo1 - anyo2;
					if(mes1 > mes2) {
						mesT = mes1 - mes2;
						if(dia1 > dia2) {
							diaT  = dia1 - dia2;
						}
						else {
							diaT  = dia2 - dia1;
						}
						diaT = diaT + (mesT * 30);
					}
					else {
						mesT = mes2 - mes1;
						if(dia1 > dia2) {
							diaT  = dia1 - dia2;
						}
						else {
							diaT  = dia2 - dia1;
						}
						diaT = diaT + (mesT * 30);
					}
					diaT = diaT + ((anyoT * 12)*30);
				}
				else {
					anyoT = anyo2 - anyo1;
					if(mes1 > mes2) {
						mesT = mes1 - mes2;
						if(dia1 > dia2) {
							diaT  = dia1 - dia2;
						}
						else {
							diaT  = dia2 - dia1;
						}
						diaT = diaT + (anyoT * 12);
					}
					else {
						mesT = mes2 - mes1;
						if(dia1 > dia2) {
							diaT  = dia1 - dia2;
						}
						else {
							diaT  = dia2 - dia1;
						}
						diaT = diaT + (mesT * 30);
					}
					diaT = diaT + ((anyoT * 12)*30);
				}
			}
			
			System.out.println("Hay " + diaT + " de diferencia.");
		}
		else {
			System.out.println("Alguno de los datos introducidos no entra en el rango anyo(1-infinito), mes(1-12) o dia(1-30)");
		}
	
		
		// 13. Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 [m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC: 
		//	   Valor de IMC Diagnóstico < 16 Criterio de ingreso en hospital 
		//     de 16 a 17 infrapeso 
		//	   de 17 a 18 bajo peso 
		//     de 18 a 25 peso normal (saludable) 
		//     de 25 a 30 sobrepeso (obesidad de grado I) 
		//     de 30 a 35 sobrepeso crónico (obesidad de grado II) 
		//     de 35 a 40 obesidad premórbida (obesidad de grado III) 
		//     >40 obesidad mórbida (obesidad de grado IV) 
		//     Nota 1: se recomienda el empleo de sentencias if–else anidadas. 
		//     Nota 2: Los operandos (peso y altura) deben ser introducidos por teclado por el usuario.
		
		System.out.println("Introduzca el peso: ");
		double peso = sc.nextDouble();
		System.out.println("Introduzca la altura: ");
		double altura = sc.nextDouble();
		double imc = peso / (altura * altura);

		if(imc < 16) {
			System.out.println("Criterio de peso en hospital.");
		}
		else if(imc >= 16 && imc < 17) {
			System.out.println("Infrapeso");
		}
		else if(imc >= 17 && imc < 18) {
			System.out.println("Bajo peso");
		}
		else if(imc >= 18 && imc < 25) {
			System.out.println("Peso nomal (Saludable)");
		}
		else if(imc >= 25 && imc < 30) {
			System.out.println("Sobrepeso (obesidad de grado I)");
		}
		else if(imc >= 30 && imc < 35) {
			System.out.println("Sobrepeso cronico (obesidad de grado II)");
		}
		else if(imc >= 35 && imc < 40) {
			System.out.println("Obesidad premorbida (obesidad de grado III)");
		}
		else{
			System.out.println("Obesidad morbida (obesidad de grado IV)");
		}
		*/
		
		// 14. Construir un programa que calcule y muestre por pantalla las raíces de la ecuación de segundo grado de coeficientes reales.
		// El programa debe diferenciar los diferentes casos que puedan surgir: la existencia de dos raíces reales distintas, 
		// de dos raíces reales iguales y de dos raíces complejas. Nota: se recomienda el empleo de sentencias if–else anidadas.
		
		System.out.println("Introduzca el primer valor numérico que tiene incognita elevada al cuadrado en la funcion ");
		int a = sc.nextInt();
		System.out.println("Introduzca el primer valor numérico que tiene incognita en la funcion ");
		int b = sc.nextInt();
		System.out.println("Introduzca el primer valor independiente en la funcion ");
		int c = sc.nextInt();
		double raiz_p= 0.0, raiz_n = 0.0;
		double raiz_cuadrada = (Math.pow(b, 2)-(4 * a * c));
		if(raiz_cuadrada < 0) {
			System.out.println("Las raices de las funciones introducidas son complejas");
		}
		else {
			raiz_p = (0 - b + (Math.sqrt(Math.pow(b, 2)-(4 * a * c)))) / (2 * a) ;
			raiz_n = (0 - b - (Math.sqrt(Math.pow(b, 2)-(4 * a * c)))) / (2 * a) ;
			if(raiz_p == raiz_n) {
				System.out.println("Las raices de la funcion introducida son iguales.");
			}
			else {
				System.out.println("Las raices de la funcion introducida son distintas.");
			}
		}

		sc.close();
	}

}
