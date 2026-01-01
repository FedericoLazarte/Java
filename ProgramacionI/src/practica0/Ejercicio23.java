package practica0;

public class Ejercicio23 {
	public static boolean canBePlaced(String a, String b, String c) {
		if (!areValid(a, b, c)) {
			return false;
		}
		int posA = findFirstMatch(a, b, 0);
		if (posA == -1)
			return false;
		int posC = findFirstMatch(c, b, posA + 2);
		return posC != -1;
	}
	
	private static boolean areValid(String a, String b, String c) {
		return  a != null && b != null && c != null &&
				!a.isBlank() && !b.isBlank() && !c.isBlank() &&
				b.length() >= 3;
	}
	
	private static int findFirstMatch(String word, String vertical, int startFrom) {
		for (int i = 0; i < word.length(); i++) {
			int pos = vertical.indexOf(word.charAt(i), startFrom);
			if (pos != - 1) {
				return pos;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(canBePlaced("JUGO", "BUENO", "ANANA"));
		System.out.println(canBePlaced("JUEGO", "FEO", "ANANA"));
	}
}
