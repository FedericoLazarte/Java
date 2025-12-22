package practica0;

public class Ejercicio15 {
	public static boolean isDivisible(int n, int m) {
		if (m == 0) throw new ArithmeticException("No se puede dividir por cero.");
		return n % m == 0;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("10 es divisile por 2?: " + isDivisible(10, 2));
			System.out.println("9 es divisile por 2?: " + isDivisible(9, 2));
			System.out.println("10 es divisile por 0?: " + isDivisible(10, 0));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
