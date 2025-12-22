package practica0;

import java.util.Scanner;

public class Ejercicio22 {
	public static String noRepeats(String word) {
		if (word == null) throw new IllegalArgumentException("La palabra ingresada no puede ser null.");
		if (word.isBlank()) return word;
		String normalizeWord = word.toLowerCase();
		StringBuilder newWord = new StringBuilder();
		for (int i = 0; i < normalizeWord.length(); i++) {
			char currentChar = normalizeWord.charAt(i);
			if (newWord.indexOf(String.valueOf(currentChar)) == -1) {
				newWord.append(currentChar);
			}
		}
		return newWord.toString();
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		String word = sc.nextLine();
		try {
			System.out.println("Palabra ingresada \"" + word + "\", y sin repetidos es \"" + noRepeats(word) + "\"");
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			sc.close();
		}
	}
}
