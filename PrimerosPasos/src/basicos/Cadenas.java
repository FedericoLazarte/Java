package basicos;

public class Cadenas {
	public static void main(String[] args) {
		String texto = "Esto es un string";
		System.out.println(texto);
		
		System.out.println("El largo de la cadena: " + texto + ", es: " + texto.length());
		
		System.out.println("En que posición se encuentra tu: " + texto.indexOf("un"));
		
		System.out.println(texto.toUpperCase());
		
		System.out.println(texto.toLowerCase());
		
		String[] textoSpliteado = texto.split(" ");
		
		for (String s : textoSpliteado) System.out.println(s);
	}
}
