package retos;

import java.util.Calendar;

public class Reto02 {
	public static void main(String[] args) {
		// Operadores de asignación
		
		int number = 5; // Asigno 5 a la variable number
		System.out.println("Valor de la variable number: " + number);
		
		number +=6; // Sumo 6 al valor de number y le asigno el resultado a number (aplicable a todos los operadores matemáticos
		System.out.println("Valor de la variable number luego de number+= 6: " + number);
		
		System.out.println("Valor de number++ (primero muestra number, luego aumenta): " + number++);
		System.out.println("Valor actual de number: " + number);
		System.out.println("Valor de ++number (aumenta al instante): " + ++number);
		
		// Operadores matemáticos
		
		int number1 = 10;
		int number2 = 5;
		int result;
		
		result = number1 + number2; // Suma
		System.out.println(number1 + " + " + number2 + " = " + result);
		
		result = number1 - number2; // Resta
		System.out.println(number1 + " - " + number2 + " = " + result);
		
		result = number1 * number2; // Multiplicación
		System.out.println(number1 + " * " + number2 + " = " + result);
		
		result = number1 / number2; // División
		System.out.println(number1 + " / " + number2 + " = " + result);
		
		result = number1 % number2; // Módulo
		System.out.println(number1 + " % " + number2 + " = " + result);
		
		// Operadores lógicos
		
		System.out.println("Verdadero con ! es: " + !true);
		System.out.println("3 > 5: " + (3 > 5));
		System.out.println("3 < 5: " + (3 < 5));
		System.out.println("3 <= 5: " + (3 <= 5));
		System.out.println("3 >= 5: " + (3 >= 5));
		System.out.println("3 == 5: " + (3 == 5));
		System.out.println("3 != 5: " + (3 != 5));
		System.out.println("Verdadero y Verdadero: " + (true && true));
		System.out.println("Verdadero y Falso: " + (true && false));
		System.out.println("Verdado o Verdadero: " + (true || true));
		System.out.println("Verdadero o Falso: " + (true || false));
		
		// Operador bit a bit
		
		int number3 = 5; // representación en bit 0101
		int number4 = 3; // representación en bit 0011
		
		System.out.println("Operador &, solo devuelve 1 si ambos bits son 1: " + (number3 & number4)); 
		System.out.println("Operador |, solo devuelve 1 si al menos un bit es 1: " + (number3 | number4)); 
		System.out.println("Operador ^, xor, compara cada bit, devuelve 1 si los bits son diferentes: " + (number3 ^ number4));
		System.out.println("Operador ~, Not bit a bit. Invierte todos los bits: " + (~number3));
		System.out.println("Operador <<, Desplaza a la izquierda la cantidad de ceros que se específica del lado derecho: " + (number3 << 1));
		System.out.println("Operador >>, Desplaza los bits a la derecha: " + (number3 >> 1));
		
		
		// Operador ternario
		
		int age = 18;
		String res = (age >= 18) ? "Eres mayor de edad." : "Eres menor de edad.";
		System.out.println(res);
				
		// if
		
		if (age >= 18) {
			System.out.println("Eres mayor de edad");
		}
		
		// if-else
		
		if (age >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
		
		// if - else if - else
		
		if (age < 13) {
			System.out.println("Eres un niño.");
		} else if (age >= 13 && age < 18) {
			System.out.println("Eres adolescente");
		} else {
			System.out.println("Eres un adulto");
		}
		
		// if anidados
		
		int temperature = 27;
		boolean isSnowing = false;
		if (temperature > 15) {
			if (temperature > 25) {
				System.out.println("Ir a la playa.");
			} else {
				System.out.println("Ir a la montaña.");
			}
		} else if (temperature < 5) {
			if (isSnowing) {
				System.out.println("Ir a esquiar.");
			}
		} else {
			System.out.println("Quedarse en casa.");
		}
		
		// switch
		
		Integer day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		switch(day) {
		case 1:
			System.out.println("Domingo.");
			break;
		case 2:
			System.out.println("Lunes.");
			break;
		case 3:
			System.out.println("Martes.");
			break;
		case 4:
			System.out.println("Miércoles.");
			break;
		case 5:
			System.out.println("Jueves.");
			break;
		case 6:
			System.out.println("Viernes.");
			break;
		case 7:
			System.out.println("Sábado.");
			break;
		default:
			System.out.println("Operación errónea.");
		}
		
		// for
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Número: " + i);
		}
		
		// for-each
		
		int[] numbers = {1, 2, 3, 4, 5};
		for (int n : numbers) {
			System.out.println("Número: " + n);
		}
		
		// while
		
		int i = 1;
		while (i <= 10) {
			System.out.println("Número: " + i);
			i++;
		}
		
		// do-while
		
		i = 1;
		do {
			System.out.println("Número: " + i);
			i++;
		} while (i <= 10);
	}
}
