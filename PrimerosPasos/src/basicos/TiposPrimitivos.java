package basicos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// 8 bits
		byte byteMin = -128;
		byte byteMax = 127;
		System.out.println("El valor mínimo del tipo primitivo byte es: " + byteMin);
		System.out.println("El valor máximo del tipo primitivo byte es: " + byteMax);
		
		// 16 bits
		short shortMin = -32768;
		short shortMax = 32767;
		System.out.println("El valor mínimo del tipo primitivo short es: " + shortMin);
		System.out.println("El valor máximo del tipo primitivo short es: " + shortMax);
		
		// int min -2³¹ a 2³¹ - 1, 32
		int intMin = Integer.MIN_VALUE;
		int intMax = Integer.MAX_VALUE;
		System.out.println("El valor mínimo del tipo primitivo int es: " + intMin);
		System.out.println("El valor máximo del tipo primitivo int es: " + intMax);
		
		// long min -2⁶³ a 2⁶³ - 1, 64
		long longMin = Long.MIN_VALUE;
		long longMax = Long.MAX_VALUE;
		System.out.println("El valor mínimo del tipo primitivo long es: " + longMin);
		System.out.println("El valor máximo del tipo primitivo long es: " + longMax);
		
		// 32 bits
		float flotante = 12.3f;
		System.out.println("Este es un número float: " + flotante);
		
		// 64 bits
		double d = 12.3;
		System.out.println("Este es un número double: " + d);
		
		// char 16 bits, 0 a 65535
		char c = 64;
		System.out.println("El caracter del valor 128 es: " + c);
		
		// boolean
		boolean verdadero = true;
		boolean falso = false;
		System.out.println("Este es el valor de un booleano verdadero: " + verdadero);
		System.out.println("Este es el valor de un booleano falso: " + falso);
	}
}
