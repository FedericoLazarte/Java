package practica0;

import java.util.Arrays;

public class Ejercicio29 {
	public static double average(double[] arr) {
		if (isEmpty(arr)) return 0;
		double sum = sum(arr);
		return sum / arr.length;
	}
	
	private static double sum(double[] arr ) {
		if (isEmpty(arr)) return 0;
		double sum = 0;
		for (double value : arr) {
			sum += value;
		}
		return sum;
	}
	private static boolean isEmpty(double[] arr) {
		return arr == null || arr.length == 0;
	}
	
	public static void main(String[] args) {
		double[] arr = {1, 2, 3, 4, 5};
		System.out.println("El promedio del arreglo " + Arrays.toString(arr) + " es: " + average(arr));
	}
}
