import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name = "AleFe fREITAS SANtos";
		
		String s01 = name.toLowerCase();
		String s02 = name.toUpperCase();
		String s03 = name.trim();
		String s04 = name.substring(2);
		String s05 = name.substring(2, 9);
		String s06 = name.replace('a', 'x');
		String s07 = name.replace("tos", "xy");
		
		int i = name.indexOf("A");
		int j = name.lastIndexOf("A");
		
		System.out.println("Original: - " + name + " -");
		System.out.println("toLowerCase: - " + s01 + " -"); // Todas as letras minusculas.
		System.out.println("toUpperCase: - " + s02 + " -"); // Todas as letras maiusculas.
		System.out.println("trim: - " + s03 + " -"); // Elimina os espaços nos cantos da String.
		System.out.println("substring(2): - " + s04 + " -"); // Pega a String a partir de um determinado ponto.
		System.out.println("substring(2, 9): - " + s05 + " -"); // Pega a String a partir de um determinado ponto e recorta de trás para frente.
		System.out.println("replace('a', 'x'): - " + s06 + " -"); // Troca determinada caractere por outra.
		System.out.println("replace(tos, xy): - " + s07 + " -"); // Troca determinada caractere por outra (Substring).

		System.out.println("index of 'A': - " + i + " -"); // aponta a localização da primeira aparição da caractere.
		System.out.println("last index of 'A': - " + j + " -\n"); // aponta a localização da ultima aparição da caractere.
		
		
		
		
		String s = "Wendel Gabriel da Silva Sena";
		
		String[] vect = s.split(" "); // separa a String em varias partes e guarda informação em vetores.
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		System.out.println(vect[4]);
		
		
		sc.close();
	}
}

