package basicos;

public class Metodos {
	// Método sin retorno
	public static void saludar(String nombre) {
		System.out.println("Hola, " + nombre);
	}
	
	// Método con retorno
	public static int sumar(int a, int b) {
		return a + b;
	}
	
	// Método estático
	public static void metodoEstatico() {
		System.out.println("Este es un método estático!!");
	}
	
	// Método no estático
	public void metodoNoEstatico() {
		System.out.println("Este es un método no estático!!");
	}
	
	// Método sobre cargado de sumar
	public static double sumar(double a, double b) {
		return a + b;
	}
	
	// Método recursivo
	public static int factorial(int n) {
		if (n == 0) return 1;
		return n * factorial(n - 1);
	}
	
	// Método con parametros variables
	public static int sumar(int ...args) {
		if (args.length == 0) return 0;
		if (args.length == 1) return args[0];
		if (args.length == 2) return args[0] + args[1];
		int suma = 0;
		for (int n : args) {
			suma += n;
		}
		return suma;
	}
	
	public static void main(String[] args) {
		saludar("Federico");
		System.out.println("3 + 2 = " + sumar(3, 2));
		Metodos.metodoEstatico();
		Metodos metodo = new Metodos();
		metodo.metodoNoEstatico();
		System.out.println("Suma sobre cargada, 3 + 2 = " + sumar(2.0, 3.0));
		System.out.println("El factorial de 5 es: " + factorial(5));
		System.out.println("Suma parametros variables: " + sumar(new int[] {1, 2, 3}));
		System.out.println("Suma parametros variables: " + sumar(new int[] {1, 2, 3, 5}));
		System.out.println("Suma parametros variables: " + sumar(new int[] {1, 2, 3, 5, 8}));
	}
}
