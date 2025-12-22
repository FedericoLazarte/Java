package practica0;

import java.util.Arrays;

public class Ejercicio28 {
	public static boolean isSorted(int[] arr) {
		if (isEmpty(arr)) return false;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isEmpty(int[] arr) {
		return arr == null || arr.length == 0;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {1, 3, 2, 5, 4};
		System.out.println("El arreglo " + Arrays.toString(arr1) + " está ordenado? " + isSorted(arr1));
		System.out.println("El arreglo " + Arrays.toString(arr2) + " está ordenado? " + isSorted(arr2));
	}
}
