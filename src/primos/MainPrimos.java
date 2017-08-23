package primos;

import java.util.Scanner;

public class MainPrimos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		new Primos(sc.nextInt(),sc.nextInt()).resolver();
		sc.close();
	}
	
}
