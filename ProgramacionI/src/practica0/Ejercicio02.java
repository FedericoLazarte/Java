package practica0;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa tu nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Hola " + nombre);
		scanner.close();
	}
}
