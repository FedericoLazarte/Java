package practica0;

public class Ejercicio34 {
	
	public static void insertAsteriskToString(String s) {
		if (s == null) throw new IllegalArgumentException("La palabra ingresada no puede ser nula.");
		if (s.isEmpty()) return;
		if (s.length() == 1) System.out.print(s.charAt(0));
		else System.out.print(s.charAt(0) + "*");
		
		insertAsteriskToString(rest(s));
	}
	
	private static String rest(String s) {
		return s.substring(1);
	}
	
	public static void main(String[] args) {
		insertAsteriskToString("Hola");
	}
}
