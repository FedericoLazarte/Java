package practica0;

import java.util.Scanner;

public class Ejercicio16 {
	public static void printReverse(String string) {
		System.out.println(reverse(string));
	}
	
	public static String reverse(String word) {
		if (word == null) throw new IllegalArgumentException("La cadena ingresada no puede ser nula.");
		StringBuilder sb = new StringBuilder(word.length());
		if (word.length() <= 1) return word;
		for (int i = word.length() - 1; i >= 0; i--) {
			sb.append(word.charAt(i));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una palabra o frase: ");
		String word = sc.nextLine();
		try { 
			printReverse(word);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
