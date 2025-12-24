
package practica0;

public class Ejercicio33 {
	// Máximo común divisor
	public static int gcd(int a, int b) {
		if (a == 0 && b == 0)
			throw new IllegalArgumentException("GCD is undefined for (0, 0)");
		a = Math.abs(a);
		b = Math.abs(b);
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	public static void main(String[] args) {
		System.out.println(gcd(36, 20));
	}
}
