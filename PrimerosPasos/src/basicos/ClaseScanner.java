package basicos;

import java.util.Scanner;

public class ClaseScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String name = sc.nextLine();
		
		System.out.println("Introduce tu edad: ");
		int age = sc.nextInt();
		
		System.out.println("Introduce tu altura (en metros): ");
		double height = sc.nextDouble();
		
		System.out.println("Hola, " + name + " tienes " + age + " años y mides " + height);
		

		
		// En el caso del que el dato ingresado es inválido
		
		System.out.println("Ingresa un número entero: ");
		while (!sc.hasNextInt()) {
			System.out.println("Esto no es un número entero. Inténtalo de nuevo.");
			sc.next();
		}
		int number = sc.nextInt();
		System.out.println("El valor entero ingresado es: " + number);
		
		sc.close();
	}
}
