package basicos;

import java.util.Calendar;

public class Condicionales {
	public static void main(String[] args) {
		// if
		int temperatura = 25;
		boolean haceSol = true;
		boolean nevando = false;

		if (temperatura > 25) {
			System.out.println("A la playa!!1");
		}

		if (haceSol) {
			System.out.println("No te olvides la sombrilla");
		}

		if (nevando || haceSol) {
			System.out.println("Que bien");
		}

		nevando = true;

		if (nevando && (temperatura >= 20 && temperatura <= 30)) {
			System.out.println("No me lo creo");
		}

		if ((temperatura < 0 || temperatura > 30) && haceSol) {
			System.out.println("Mejor me quedo en casa");
		}

		if (true)
			System.out.println("Hola");

		// if - else

		int edad = 16;
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}

		// if-else if- else
		edad = 20;

		if (edad < 13) {
			System.out.println("Eres un ninño");
		} else if (edad >= 13 && edad < 18) {
			System.out.println("Eres un adolescente");
		} else {
			System.out.println("Eres un adulto");
		}

		// if anidados
		if (temperatura > 15) {
			if (temperatura > 25) {
				System.out.println("A la playa!");
			} else {
				System.out.println("A la montaña!");
			}
		} else if (temperatura < 5) {
			if (nevando) {
				System.out.println("A esquiar!!");
			}
		} else {
			System.out.println("A descazar...");
		}

		// Operador ternario

		edad = 18;
		String res = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
		System.out.println(res);

		// switch

		Integer dia = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Lunes");
			break;
		case 3:
			System.out.println("Martes");
			break;
		case 4:
			System.out.println("Miércoles");
			break;
		case 5:
			System.out.println("Jueves");
			break;
		case 6:
			System.out.println("Viernes");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Opción erronea");
		}

		String tipoVehiculo = "coche";
		switch (tipoVehiculo) {
		case "coche":
			System.out.println("Puedes pasar de 00:00 a 08:00");
			break;
		case "camion":
			System.out.println("Puedes pasar de 08:00 a 16:00");
			break;
		case "moto":
			System.out.println("Puedes pasar de 16:00 a 24:00");
			break;
		default:
			System.out.println("No se puede pasar con un " + tipoVehiculo);
			break;
		}

		switch (dia) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Dia laboral");
			break;
		case 1:
		case 7:
			System.out.println("Fin de semana");
			break;
		default:
			System.out.println("La semana solo tiene 7 dias");
			break;
		}
	}
}
