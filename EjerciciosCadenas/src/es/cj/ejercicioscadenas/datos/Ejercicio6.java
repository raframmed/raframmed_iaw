package es.cj.ejercicioscadenas.datos;

import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {
		String cod_Morse [] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", // a-i
	            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", // j-q
	            ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".......", // r-" "
	            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", // A-G
	            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", // H-P
	            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", // Q-X
	            "-.--", "--..", "......." }; //Y-Z
		char abecedario [] = new char [26];

		for (int i = 0; i < abecedario.length; i++) {
			abecedario[i] = (char) ('a' + i);
		}
	}

}
