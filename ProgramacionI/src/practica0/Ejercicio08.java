package practica0;

import java.util.Scanner;

public class Ejercicio08 {
	public static double enterExamGrade(Scanner sc) {
		double grade;
		boolean flag = true;

		do { // Si o si necesito que al menos se ejecuta una vez, por eso do - while
			System.out.println("Ingresa la nota: ");
			while (!sc.hasNextDouble()) {
				System.out.println("El tipo de dato ingresado es inválido. Vuelve a ingresar la nota: ");
				sc.nextLine();
			}
			grade = sc.nextDouble();
			sc.nextLine();

			if (grade < 1 || grade > 10) {
				System.out.println("La nota debe estar entre 1 - 10. Vuelva a intentar");
			} else {
				flag = false;
			}
		} while (flag);

		return grade;
	}

	public static void giveExamGrade(double x, double y) {
		double result = (x + y) / 2;

		if (result >= 7) {
			System.out.println("Promocionado.");
		} else if (result >= 4) {
			System.out.println("Aprobado.");
		} else {
			System.out.println("Debe recuperar.");
		}
	}

	public static void main(String[] args) {
		double grade1;
		double grade2;
		Scanner sc = new Scanner(System.in);

		grade1 = enterExamGrade(sc);
		grade2 = enterExamGrade(sc);

		giveExamGrade(grade1, grade2);
	}
}
