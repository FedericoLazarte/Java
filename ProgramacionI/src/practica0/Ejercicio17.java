package practica0;

import java.util.Scanner;

public class Ejercicio17 {
	public static int countOccurrences(String word, char character) {
		if (word == null) throw new IllegalArgumentException("La palabra ingresada no puede ser null");
		if (word.isEmpty()) return 0;
		String lowercaseWord = word.toLowerCase();
		int count = 0;
		for (int i = 0; i < lowercaseWord.length(); i++) {
			if (lowercaseWord.charAt(i) == character) count++;
		}
		return count;
	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa una palabra: ");
		String word = sc.nextLine();
		System.out.println("Ingresa una caracter: ");
		String character = sc.nextLine().toLowerCase();
		
		if (character.length() != 1) {
			System.out.println("Debes ingresar un solo caracter.");
		} else {
			char c = character.charAt(0);
			try {
				int occurrences = countOccurrences(word, c);
				System.out.println("El carácter '" + character + 
                        "' aparece " + occurrences + 
                        " veces en la palabra \"" + word + "\".");
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		sc.close();
	}
}
