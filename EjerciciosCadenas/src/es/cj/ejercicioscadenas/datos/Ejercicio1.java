package es.cj.ejercicioscadenas.datos;

public class Ejercicio1 {

	public static void main(String[] args) {
		String palabra = "CiUdNdJaRdIn";

		// MAYUSCULAS

		System.out.println(palabra.toUpperCase());

		// MINUSCULAS
		System.out.println(palabra.toLowerCase());

		// MOSTRAR LOS DOS PRIMEROS Y LOS DOS ÚLTIMOS
		if (palabra.length() >= 2) {
			System.out.println(palabra.substring(0, 2));
			System.out.println(palabra.substring(palabra.length()-2));
		}
		
		// NUMERO DE VECES QUE SE REPITE EL ULTIMO CARACTER
		String ultimo = palabra.substring(palabra.length()-1);
		System.out.println(ultimo);
		int contador = 0;
		
		for (int i = 0; i < palabra.length(); i++) {
			if(palabra.substring(i, i+1).equalsIgnoreCase(ultimo)) {
				contador++;
			}
		}
		System.out.println(contador);
		
		// REEMPLAZAR  todas las veces que se repite el primer carácter por el primer carácter 
		// en mayúscula. Añadir por el principio y por el final la cadena "***"

		String primero = palabra.substring(0,1);
		System.out.println(primero);
		
		palabra = palabra.replaceAll(primero.toLowerCase(), primero.toUpperCase());
		System.out.println(palabra);
		
		// AÑADIR AL PRINCIPIO Y AL FINAL LA CADENA ***
		
		// palabra = "***" + palabra + "***";
		StringBuffer sb = new StringBuffer(palabra);
		sb.append("***");
		sb.insert(0, "***");
		System.out.println(sb.toString());
		
	}

}
