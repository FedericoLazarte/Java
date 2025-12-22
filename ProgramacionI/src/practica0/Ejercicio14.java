package practica0;

public class Ejercicio14 {
	public static int quantityFigures(int n) {
		String number = Integer.toString(n);
		return number.length();
	}
	
	public static void main(String[] args) {
		System.out.println("La cantidad de cifras de 1400 es: " + quantityFigures(1400));
		System.out.println("La cantidad de cifras de 14 es: " + quantityFigures(14));
		System.out.println("La cantidad de cifras de 140 es: " + quantityFigures(140));
		System.out.println("La cantidad de cifras de 1400000 es: " + quantityFigures(1400000));
	}
}
