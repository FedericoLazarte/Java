package practica0;

public class Ejercicio10 {
	public static int summation(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) sum += i;
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("La sumatoria de los números de 5 es: " + summation(5));
		System.out.println("La sumatoria de los números de 10 es: " + summation(10));
		System.out.println("La sumatoria de los números de 3 es: " + summation(3));
	}
}
