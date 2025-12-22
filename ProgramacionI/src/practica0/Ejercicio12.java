package practica0;

public class Ejercicio12 {
	public static double pow(double x, int a) {
	    if (a < 0) {
	        return 1.0 / pow(x, -a);
	    }

	    if (a == 0) return 1;
	    if (x == 0) return 0;

	    double result = 1;
	    for (int i = 0; i < a; i++) {
	        result *= x;
	    }
	    return result;
	}
	
	public static void main(String[] args) {
		System.out.println("La potencia de 2³ = " + pow(2.0, 3));
	}
}
