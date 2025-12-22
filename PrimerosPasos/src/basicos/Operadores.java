package basicos;

public class Operadores {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Operadores de asignación
		
		int x = 5;
		System.out.println("Valor x: " + x);
		x += 6; // Se puede replicar con todos los operadores +, -, *, %, /
		System.out.println("Valor x: " + x);
		
		System.out.println("Valor de x++ (primero muestra x, luego aumenta): " + x++);
		System.out.println("El valor de x luego de x++: " + x);
		System.out.println("Valor de ++x (aumenta al instante): " + ++x);
		
		// Operadores matemáticos
		
		int a = 10; 
		int b = 5;
		int res;
		
		res = a + b;
		System.out.println("Suma: " + res);
		
		res = a - b;
		System.out.println("Resta" + res);
		
		res = a * b;
		System.out.println("Multiplicación: " + res);
		
		res = a / b;
		System.out.println("División: " + res);
		
		res = a % b;
		System.out.println("Módulo: " + res);
		
		// Operadores lógicos 
		
		System.out.println("Verdadero con ! es: " + !true);
		System.out.println("3 > 5: " + (3 > 5));
		System.out.println("3 < 5: " + (3 < 5));
		System.out.println("3 == 5: " + (3 == 5));
		System.out.println(" 3 != 5: " + (3 != 5));
		System.out.println("Verdadero y verdadedo es: " + (true && true));
		System.out.println("Verdadero o falso es: " + (true || false));
		System.out.println("3 <= 5: " + (3 <= 5));
		System.out.println("3 >= 5: " + (3 >= 5));
		
		// Operador bit a bit
		
		System.out.println(5 & 3); // Comparada cada bit, devuelve 1 solo si ambos bits son 1: 0101 & 0011 = 0001
		System.out.println(5 | 3); // Comparaca cada bit, devuelve 1 si al menos un bit es 1:  0101 | 0011 = 0111
		System.out.println(5 ^ 3); // xor, compara cada bit, devuelve 1 si los bits son diferentes. 0101 ^ 0011 = 0110 = 6
		
		System.out.println(~5); // Not bit a bit, Invierte todos los bits 5 = 0101, ~5 = 1010 (en complemento a dos)
		
		System.out.println(5 << 1); // desplazo a la izquierda 1 cero 0101 -> 1010 = 10
		System.out.println(5 << 2); // desplazo a la izquierda 2 ceros 0101 -> 10100 = 20
		
		System.out.println(20 >> 1); //mueve todos los bits hacia la derecha, equivale a dividir, 10100 -> 1010 
		System.out.println(20 >> 2); // 10100 -> 00101
		
	}
}
