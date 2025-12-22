package practica0;

import java.util.Scanner;

public class Ejercicio21 {
	public static boolean hasRepeats(String word) {
		if (word == null) throw new IllegalArgumentException("La palabra ingresada no puede ser null.");
		if (word.isBlank()) return true;
		String normalizeWord = word.toLowerCase().replaceAll("\\s", "");
		for (int i = 0; i < normalizeWord.length() - 1; i++) {
			char character = normalizeWord.charAt(i);
			for (int j = i + 1; j < normalizeWord.length(); j++) {
				if (character == normalizeWord.charAt(j)) return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		String word = sc.nextLine();
		try {
			boolean result = hasRepeats(word);
			if (result) System.out.println("La palabra \"" + word + "\" no tiene repetidos");
			else System.out.println("La palabra \"" + word + "\" tiene repetidos");
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			sc.close();
		}
	}
}
