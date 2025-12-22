package practica0;

public class Ejercicio13 {
	public static int factorial(int n) {
		if (n < 0) throw new IllegalArgumentException("El número ingresado debe sdebe ser >= 0.");
		if (n > 12) throw new ArithmeticException("Overflow de int");
		if (n <= 1) return 1;
		int result = 1;
		for (int i = 2; i <= n; i++) result *= i;
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("El factorial de 5 es: " + factorial(5));
	}
}
