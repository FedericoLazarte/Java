package basicos;

import java.util.Arrays;

public class Arreglos {
	public static void main(String[] args) {
		// Creción de arrays
		
		int[] arr;
		arr = new int[5];
		
		// Asignar valores
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		// Acceder a un valor
		
		System.out.println("El elemento en la posición 3 es: " + arr[3]);
		
		// Manera más corta de crear un arrya
		
		//	int[] arr2 = {1, 2, 3, 4, 5};
		
		// Recorrer array
		
		for (int i = 0; i < arr.length; i++) System.out.println("Poscición: " + i + ", Valor: " + arr[i]);
		
		for (int n : arr) System.out.println("Valor: " + n);
		
		int i = 0;
		while (i < arr.length) {
			System.out.println("Posición: " + i + ", Valor: " + arr[i]);
			i++;
		}
		
		// Métodos arrays
		
		int[] numbers = {2, 3, 4, 1, 6, 5};
		System.out.println("Array original: " + Arrays.toString(numbers));
		
		Arrays.sort(numbers);
		System.out.println("Array ordenado: " + Arrays.toString(numbers));
		
		System.out.println(Arrays.binarySearch(numbers, 4)); // Me devuelve la posición
		
		int[] n2 = new int[3];
		Arrays.fill(n2, 0, 3, 1);
		System.out.println(Arrays.toString(n2));
		
		// Clonación de arrays
		
		int[] original = {1, 2, 3};
		int[] copia = original.clone(); // Hace una copia superficial
		
		System.out.println("Lista original: " + Arrays.toString(original));
		System.out.println("Lista copia: " + Arrays.toString(copia));
		original[2] = 10;
		System.out.println("Lista original, luego de modificar original: " + Arrays.toString(original));
		System.out.println("Lista copia, luego de modificar original: " + Arrays.toString(copia));
		
		// Convertir array en lista
		
		String[] animales = {"Gato", "Perro", "Pez"};
		java.util.List<String> animalesLista = Arrays.asList(animales); // Tamaño fijo
		System.out.println("Lista normal: " + animalesLista.toString());
		
		animales[1] = "Fede";
		System.out.println("Lista luego de modificar un elemento del array; " + animalesLista.toString());
		
		
		// Convertir una lista a array
		String[] animales2 = animalesLista.toArray(new String[0]);
		System.out.println(Arrays.toString(animales2));
	}
}
