package practica0;

import java.util.Scanner;

public class Ejercicio09 {
	private static final String[] MONTHS = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
			"Septiembre", "Octubre", "Noviembre", "Diciembre" };

	// Asume una fecha válida
	public static void printDate(int day, int month, int year) {
		String nameMonth = nameMonth(month);
		System.out.println(day + " de " + nameMonth + " de " + year);
	}
	
	public static boolean isValidDay(int day, int month, int year) {
		if (!isValidYear(year))
			return false;
		if (!isValidMonth(month))
			return false;

		if (month == 2) {
			if (isLeapYear(year)) {
				return day >= 1 && day <= 29;
			} else {
				return day >= 1 && day <= 28;
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return day >= 1 && day <= 30;
		} else {
			return day >= 1 && day <= 31;
		}
	}
	
	public static int enterDay(Scanner sc) {
		System.out.println("Ingrese día del mes (entero): ");
		return enterInt(sc);
	}

	public static int enterMonth(Scanner sc) {
		System.out.println("Ingrese mes (entero): ");
		return enterInt(sc);
	}

	public static int enterYear(Scanner sc) {
		System.out.println("Ingrese año(entero): ");
		return enterInt(sc);
	}
	
	private static String nameMonth(int month) {
		return isValidMonth(month) ? MONTHS[month - 1] : "Mes inválido";
	}

	private static boolean isValidYear(int year) {
		return year >= 1000;
	}

	private static boolean isValidMonth(int month) {
		return month >= 1 && month <= 12;
	}

	private static boolean isLeapYear(int year) {
		if (!isValidYear(year))
			return false;
		return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
	}

	private static int enterInt(Scanner sc) {
		while (!sc.hasNextInt()) {
			System.out.println("Tipo de dato ingresado no válido. Vuelva a intentar: ");
			sc.nextLine();
		}
		int integer = sc.nextInt();
		sc.nextLine();
		return integer;
	}

	public static void main(String[] args) {
		int day;
		int month;
		int year;
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		do {
			day = enterDay(sc);
			month = enterMonth(sc);
			year = enterYear(sc);

			if (isValidDay(day, month, year)) {
				flag = false;
			} else {
				System.out.println("La fecha ingresada es incorrecta. Vuelva a ingresar la fecha.");
			}
		} while (flag);

		printDate(day, month, year);
		sc.close();
	}
}
