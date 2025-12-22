package basicos;

public class Scope {
	// scope de clase (variable de instancia)
	private int valorGlobal = 5;
	
	public void metodo1() {
		// scope de método
		int valorLocal = 5;
		
		// Dentro de un bloque (scope de bloque)
		if (valorLocal > 0) {
			int valorBloque = 10;
			System.out.println("Valor de bloque: " + valorBloque); // Accesible dentro del bloque
		}
		
		// valorBloque ya no es accesiboe aquí
		System.out.println("Valor local: " + valorLocal); // valor accesible dentro del método.
	}
	
	public void metodo2() {
		// variableLocal no accesible aquí
		// Sin embargo, variable global si
		System.out.println("Valor global: " + valorGlobal);
	}
	
	public static void metodo3() {
		// valorGlobal no puede ser usada en este método, salvo que sea static.
		System.out.println("Las variables de instancia no funcionan en métodos estáticos");
	}
	public static void main(String[] args) {
		

	}

}
