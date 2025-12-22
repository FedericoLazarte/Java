package practica0;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		int number1;
		int number2;
		int result;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el primer valor (entero): ");
		while (!scanner.hasNextInt()) {
			System.out.println("El valor debe ser un entero, vuelva a ingresar un valor: ");
			scanner.nextLine();
		}
		number1 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingresa el segundo valor (entero): ");
		while (!scanner.hasNextInt()) {
			System.out.println("El valor debe ser un entero, vuelva a ingresar un valor: ");
			scanner.nextLine();
		}
		number2 = scanner.nextInt();
		result = number1 + number2;
		System.out.println(number1 + " + " + number2 + " = " + result);
		scanner.close();
	}
}
