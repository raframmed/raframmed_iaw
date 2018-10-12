package es.cj.script;

import java.io.IOException;
import java.util.Scanner;



public class tarea1_6 {
	
	private static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) throws IOException {

		int opc=0;
        do{
            System.out.println("****** Menú ******\n");
            System.out.println("1.- Encriptar \n");
            System.out.println("2.- Desencriptar \n");
            System.out.println("3.- Salir \n");
            System.out.println("Eliaja una opción:");
            opc = sc.nextInt();
            
            switch(opc) {
            case 1:
            	System.out.println("Introduzca el texto a ecriptar seprados por '_':");
            	String palabra = sc.next();
            	
            	for (int i = 0; i <palabra.length (); i++) {
            		char c = palabra.charAt(i); 
            		switch(c) {
            		case 'a': c = 'z';
            			break;
            		case 'b': c = 'y';
            			break;
            		case 'c': c = 'x';
        				break;
            		case 'd': c = 'w';
        				break;
            		case 'e': c = 'v';
            			break;
            		case 'f': c = 'u';
        				break;
            		case 'g': c = 't';
        				break;
            		case 'h': c = 's';
        				break;
            		case 'i': c = 'r';
        				break;
            		case 'j': c = 'q';
        				break;
            		case 'k': c = 'p';
        				break;
            		case 'l': c = 'o';
        				break;
            		case 'm': c = 'n';
        				break;
            		case 'n': c = 'm';
        				break;
            		case 'o': c = 'l';
        				break;
            		case 'p': c = 'k';
        				break;
            		case 'q': c = 'j';
        				break;
            		case 'r': c = 'i';
        				break;
            		case 's': c = 'h';
        				break;
            		case 't': c = 'g';
        				break;
            		case 'u': c = 'f';
        				break;
            		case 'v': c = 'e';
        				break;
            		case 'w': c = 'd';
            			break;
            		case 'x': c = 'c';
        				break;
            		case 'y': c = 'b';
        				break;
            		case 'z': c = 'a';
        				break;
            		case 'ñ': c = '2';
            			break;
            		default: c = '1';
        				break;
            		}
            		System.out.print("Aqui tiene su texto encriptado: " + c);
            		
            				
            	}
            	System.out.println("\n\n\n\n");
            	break;
            case 2:
            	System.out.println("Introduzca el texto a desencriptar:");
            	String palabra_des = sc.next();
            	
            	for (int i = 0; i <palabra_des.length (); i++) {
            		char c = palabra_des.charAt(i); 
            		switch(c) {
            		case 'a': c = 'z';
            			break;
            		case 'b': c = 'y';
            			break;
            		case 'c': c = 'x';
        				break;
            		case 'd': c = 'w';
        				break;
            		case 'e': c = 'v';
            			break;
            		case 'f': c = 'u';
        				break;
            		case 'g': c = 't';
        				break;
            		case 'h': c = 's';
        				break;
            		case 'i': c = 'r';
        				break;
            		case 'j': c = 'q';
        				break;
            		case 'k': c = 'p';
        				break;
            		case 'l': c = 'o';
        				break;
            		case 'm': c = 'n';
        				break;
            		case 'n': c = 'm';
        				break;
            		case 'o': c = 'l';
        				break;
            		case 'p': c = 'k';
        				break;
            		case 'q': c = 'j';
        				break;
            		case 'r': c = 'i';
        				break;
            		case 's': c = 'h';
        				break;
            		case 't': c = 'g';
        				break;
            		case 'u': c = 'f';
        				break;
            		case 'v': c = 'e';
        				break;
            		case 'w': c = 'd';
            			break;
            		case 'x': c = 'c';
        				break;
            		case 'y': c = 'b';
        				break;
            		case 'z': c = 'a';
        				break;
            		case '2': c = 'ñ';
            			break;
            		case '1': c = ' ';
            			break;
            		default: c = '1';
        				break;
            		}
            		
            		System.out.print("Aqui tiene su texto desencriptado: " + c);
            		
            	}
            	System.out.println("\n\n\n\n");
            	break;	
            }
            
         
        }while(opc!=3);
        System.out.println("Programa terminado");
	}

}
