package practica0;

import java.util.Scanner;

public class Ejercicio20 {
	public static boolean isPalindrome(String word) {
		if (word == null) throw new IllegalArgumentException("La palabra ingresada no puede ser null");
		if (word.isBlank()) return true;
		String normalizeWord = word.toLowerCase().replaceAll("\\s", "");
		String reverseWord = reverseString(normalizeWord);
		return normalizeWord.equals(reverseWord);
	}
	
	private static String reverseString(String word) {
		if (word == null) throw new IllegalArgumentException("La palabra ingresada no puede ser null");
		return new StringBuilder(word).reverse().toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una palabra para saber si es capicúa: ");
		String word = sc.nextLine();
		try {
			System.out.println("La palabra \"" + word + "\" es capicúa?");
			if (isPalindrome(word)) System.out.println("La palabra \"" + word + "\" es capicúa");
			else System.out.println("La palabra \"" + word + "\" NO es capicúa?");
		} catch (IllegalArgumentException e) {
			System.out.println("Error:" + e.getMessage());
		} finally {
			sc.close();
		}
	}
}
