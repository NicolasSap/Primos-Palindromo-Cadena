package string;

import java.util.Scanner;

public class MainString {

	public static void main(String[] args) {
		StringBuilder dato = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		dato = new StringBuilder(sc.nextLine());
		new Stringg(dato).resolver();
		sc.close();
	}

}
