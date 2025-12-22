package practica0;

import java.util.List;
import java.util.Scanner;

public class Ejercicio18 {
	private static final List<Character>VOWELS = List.of('a', 'á', 'e', 'é', 'i', 'í', 'o', 'ó', 'u', 'ú', 'ü');
	
	public static int countVowels(String word) {
		if (word == null) throw new IllegalArgumentException("La palabra ingresada no puede ser null.");
		if (word.isEmpty()) return 0;
		String lowercaseWord = word.toLowerCase();
		int count = 0;
		for (int i = 0; i < lowercaseWord.length(); i++) {
			if (isVowel(lowercaseWord.charAt(i))) count++;
		}

		return count;
	}
	
	public static boolean isVowel(char c) {
		return VOWELS.contains(c);
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa una palabra: ");
		String word = sc.nextLine();
		try {
			System.out.println("La cantidad de vocales que tiene la palabra \"" + word + "\" es de: " + countVowels(word));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
