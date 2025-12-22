package basicos;


public class Loops {
	public static void main(String[] args) {
		// for
		for (int i = 1; i <= 5; i++) {
			System.out.println("Número: " + i);
		}
		
		// for-each
		int[] numeros = {1, 2, 3, 4, 5};
		for (int n : numeros) {
			System.out.println("Número: " + n);
		}
		
		// while
		int i = 1;
		while (i <= 5) {
			System.out.println("Número: " + i);
			i++;
		}
		
		// do while
		i = 1;
		do {
			System.out.println("Número: " + i);
			i++;
		} while (i <= 5);
		
		// break
		for (int j = 1; j <= 10; j++) {
			if (j == 5) break;
			System.out.println("Número: " + j);
		}
		
		// continue
		for (int j = 1; j <= 10; j++) {
			if (j == 5) continue;
			System.out.println("Número: " + j);
		}
		
		// Bloques anidados
		int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		for (int a = 0; a < mat.length; a++) {
		    for (int j = 0; j < mat[a].length; j++)
		        System.out.print(mat[a][j] + " ");
		    System.out.println();
		} 
		
		String[][] cities = { { "Colombia", "Medellín" }, { "Colombia", "Bogotá" }, { "México", "Guadalajara" }, { "México", "CDMX" } };
		for (String[] pair : cities) {
		    for (String name : pair) {
		        System.out.println(name);
		    }
		}  
	}
}
