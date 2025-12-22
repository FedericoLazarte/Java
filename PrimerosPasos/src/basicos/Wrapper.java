package basicos;

import java.util.ArrayList;

public class Wrapper {
	
	public static void main(String[] args) {
		Integer entero = 25;
		Float flotante = 13.2f;
		Double d = 12.33;
		Boolean verdadero = true;
		Character c = 166;
		Long largo = Long.MAX_VALUE;
		Byte b = 12;
		Short s = 32555;
		System.out.println(entero);
		System.out.println(flotante);
		System.out.println(d);
		System.out.println(verdadero);
		System.out.println(c);
		System.out.println(largo);
		System.out.println(b);
		System.out.println(s);
		
		
		// Autoboxing				
		ArrayList<Integer> numbersList = new ArrayList<>();
		numbersList.add(25); // Autoboxing: int 25 e convierte automáticamente a Integer
		
		// UnBoxing
		@SuppressWarnings("removal")
		Integer i = new Integer(40);
		int j = i; // Unboxing: el objeto Integer se convierte automáticamente a int
		System.out.println("El valor de j es: " + j);
		
		Integer x = 10;
		int y = x + 5; // Aquí ocurre unboxing de x para realizar la operación.
		System.out.println("El resultado de y es: " + y);
	}
}
