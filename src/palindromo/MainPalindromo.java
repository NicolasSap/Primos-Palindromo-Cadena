package palindromo;

import java.util.Scanner;

public class MainPalindromo {

	public static void main(String[] args) {
		StringBuilder dato = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		dato = new StringBuilder(sc.nextLine());
		new Palindromo(dato).resolver();
		sc.close();
	}

}
