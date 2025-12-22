package practica0;

import java.util.Scanner;

public class Ejercicio06 {
	
	public static void printSum(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}
	
	public static int enterValue(Scanner sc) {
		int number;
		System.out.println("Ingresa un valor: ");
		while (!sc.hasNextInt()) {
			System.out.println("El valor ingresado es incorrecto, vuelva a ingresar un valor: ");
			sc.nextLine();
		}
		number = sc.nextInt();
		sc.nextLine();
		return number;
	}
	
	public static void main(String[] args) {
		int number1;
		int number2;
		Scanner sc = new Scanner(System.in);
		number1 = enterValue(sc);
		number2 = enterValue(sc);
		printSum(number1, number2);
		sc.close();
	}
}
