package practica0;

public class Ejercicio30 {
	public static int summation(int number) {
		if (number < 0) throw new IllegalArgumentException("El número no puede ser negativo.");

		if (number <= 1) return number;
		return number + summation(number - 1);
	}
	
	public static int sumOfEvens(int number) {
		if (number < 0) throw new IllegalArgumentException("El número no puede ser negativo.");
		if (number < 2) return 0;
		if (number % 2 != 0) return sumOfEvens(number - 1);
		return number + sumOfEvens(number - 2);
	}
	
	public static double pow(double x, int n) {
		if (n < 0) return 1 / pow(x, -n);
		if (n == 0) return 1;
		return x *  pow(x, n - 1);
	}
	
	public static int factorial(int n) {
		if (n < 0) throw new IllegalArgumentException("El número no puede ser negativo");
		if (n == 0) return 1;
		return n * factorial(n - 1);
	}
	
	public static void main(String[] args) {
		System.out.println(summation(5));
		System.out.println(sumOfEvens(6));
		System.out.println(pow(2, 4));
		System.out.println(factorial(5));
	}
}
