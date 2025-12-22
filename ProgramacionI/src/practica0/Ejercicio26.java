package practica0;

import java.util.Arrays;

public class Ejercicio26 {
	public static int maximumIndex(int[] arr) {
		if (isEmpty(arr)) throw new IllegalArgumentException("El arreglo no puede ser vacío ni nulo");
		int max = arr[0];
		int maxIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	private static boolean isEmpty(int[] arr) {
		return arr == null || arr.length == 0;
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 3, 4, 44, 30, 5, 6, 100, 9, 33, 99, 2};
		try {
			System.out.println("El máximo índice del arreglo " + Arrays.toString(arr) + " es: " + maximumIndex(arr));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
