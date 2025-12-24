package practica0;

import java.util.Scanner;

public class Ejercicio31 {
	public static int fibonacci(int number) {
		if (number < 0) 
			throw new IllegalArgumentException("El número ingresado debe ser mayor o igual a cero.");
		if (number == 0)
			return 0;
		if (number == 1)
			return 1;
		return fibonacci(number - 1) +  fibonacci(number - 2);
	}
	

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputNaturalNumber;
		System.out.println("Ingresa un valor entero: ");
		while (!input.hasNextInt()) {
			System.out.println("El valor ingresado debe ser un número entero. Vuelva a ingresar un valor: ");
			input.nextLine();
		}
		inputNaturalNumber = input.nextInt();
		input.nextLine();
		try {
			System.out.println("El fibonacci de \"" + inputNaturalNumber + "\" es: " + fibonacci(inputNaturalNumber));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} finally {
			input.close();
		}
	}
}