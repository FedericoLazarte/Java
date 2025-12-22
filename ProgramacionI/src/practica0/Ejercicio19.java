package practica0;

import java.text.Collator;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio19 {
	/* 
	 * Collator es una clase de Java que permite comparar cadenas según las reglas de un idioma específico.
	 * es parte del paquete java.text y es escencial para ordenación internacionalizada.
	 */
	
	// Creación Collator para español
	public static final Collator SPANISH_COLLATOR = Collator.getInstance(Locale.ROOT);
	
	
	static {
		// Configuración de la fuerza de comparación
		SPANISH_COLLATOR.setStrength(Collator.PRIMARY);
	}
	
	// No hace toLowerCase ya que collator se encarga de esto ignorando mayúsculas debido a Collator.PRIMARY
	public static boolean isAlphabetical(String word) {
		if (word == null) throw new IllegalArgumentException("La palabra ingresada no puede ser null");
		if (word.isBlank()) return true;
		for (int i = 0; i < word.length() - 1; i++) {			
			String current = word.substring(i, i + 1);
			String next = word.substring(i + 1, i + 2);
			if (SPANISH_COLLATOR.compare(current, next) > 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		String word = sc.nextLine();
		try {
			System.out.println("La palabra \"" + word + "\" está ordenada?");
			if (isAlphabetical(word)) {
				System.out.println("La palabra \"" + word + "\" está ordenada");
			} else {
				System.out.println("La palabra \"" + word + "\" NO está ordenada");
			}
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}
}
