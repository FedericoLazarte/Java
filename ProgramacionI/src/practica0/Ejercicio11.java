package practica0;

public class Ejercicio11 {
	
	public static int pairSummation(int n) {
		int sum = 0;
		for (int i = 2; i <= n; i += 2) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("La sumatoria de los números de 5 es: " + pairSummation(5));
		System.out.println("La sumatoria de los números de 10 es: " + pairSummation(10));
		System.out.println("La sumatoria de los números de 3 es: " + pairSummation(3));
	}
}
