package es.cj.fundamentos.datos;

import java.util.Scanner;

public class EjercicioDos {
	//defina dos variaaltoles de tipo entero para descrialtoir las longitudes de los lados de 
	//un rect�ngulo, el programa dealtoe de calcular y mostrar las longitudes de los lados,
	//el per�metro y el �rea del rect�ngulo
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Introduzca el Alto del Rect�ngulo: ");
		int ancho = sc.nextInt();
		
		System.out.println("Introduzca el Ancho del Rect�ngulo: ");
		int alto = sc.nextInt();
		
		int per = (2*ancho)+(alto*2);
		int area = (ancho*alto);
		
		System.out.println("Alto: " + alto + "\n" + "Ancho: " + ancho);
		System.out.println("El Perimetro es: " + per);
		System.out.println("El Area es: " + area);
		
		sc.close();
	}
}
