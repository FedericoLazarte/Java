package practica0;

import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		double number1;
		double number2;
		double result;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa el primer valor: ");
		while (!scanner.hasNextDouble()) {
			System.out.println("El valor ingresado es incorrecto, vuelve a ingresar un valor: ");
			scanner.nextLine();
		}
		number1 = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Ingresa el segundo valor: ");
		while (!scanner.hasNextDouble()) {
			System.out.println("El valor ingresado es incorrecto, vuelve a ingresar un valor: ");
			scanner.nextLine();
		}
		number2 = scanner.nextDouble();
		
		result = (number1 + number2) / 2;
		
		System.out.println("El promedio es: " + result);
		scanner.close();
	}
}
