package practica0;

import java.util.Scanner;

public class Ejercicio32 {
	public static void collatz(int number) {
		if (number <= 0)
			throw new IllegalArgumentException("Number must be positive");
		System.out.println(number);
		if (number == 1) return;
		if (number % 2 == 0) {
			collatz(number / 2);
		} else {
			collatz(3 * number + 1);
		}
	}

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		System.out.println("Ingresa un valor entero: ");
		while (!input.hasNextInt()) {
			System.out.println("El valor ingresado debe ser un número entero. Vuelva a ingresar un valor: ");
			input.nextLine();
		}
		number = input.nextInt();
		input.nextLine();
		try {
			System.out.println("La sucesión de Collatz de \"" + number + "\" es: " );
			collatz(number);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} finally {
			input.close();
		}
	}
}
