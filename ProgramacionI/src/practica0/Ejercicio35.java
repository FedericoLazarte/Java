package practica0;

public class Ejercicio35 {
	public static String noRepeatedContiguousLetters(String s) {
		if (s == null) throw new IllegalArgumentException("La palabra ingresada no puede ser vacía");
		if (s.length() <= 1) {
			return s;
		}
		if (s.charAt(0) != s.charAt(1)) {
			return s.charAt(0) + noRepeatedContiguousLetters(rest(s));
		} else {
			return noRepeatedContiguousLetters(rest(s));
		}
	}
	
	private static String rest(String s) {
		return s.substring(1);
	}
	
	public static void main(String[] args) {
		System.out.println(noRepeatedContiguousLetters("pollo"));
		System.out.println(noRepeatedContiguousLetters("gggeeeeeuddddduu"));
	}
}
