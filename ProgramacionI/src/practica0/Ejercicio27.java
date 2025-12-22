package practica0;

import java.util.Arrays;

public class Ejercicio27 {
	public static int sum(int[] arr) {
		if (isEmpty(arr)) return 0;
		int sum = 0;
		for (int value : arr) {
			sum += value;
		}
		return sum;
	}
	
	public static boolean isEmpty(int[] arr) {
		return arr == null || arr.length == 0;
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 3, 4, 44, 30, 5, 6, 100, 9, 33, 99, 2};
		System.out.println("La suma de los elementos del arreglo " + Arrays.toString(arr) + " es: " + sum(arr));
	}
}
