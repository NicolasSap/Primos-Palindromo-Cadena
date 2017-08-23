package palindromo;

public class Palindromo {
	private StringBuilder stringg;
	private StringBuilder string1;
	private StringBuilder stringInv;

	public Palindromo(final StringBuilder dato) {
		this.stringg = dato;
		string1 = new StringBuilder(stringg.substring(0, stringg.length()/2));
		if (stringg.length()%2 == 0) {
			stringInv = new StringBuilder(stringg.substring((stringg.length()/2), stringg.length()));
		} else {
			stringInv = new StringBuilder(stringg.substring((stringg.length()/2)+1, stringg.length()));
		}
	}

	public void resolver() {
		stringInv.reverse();
		if (string1.toString().equalsIgnoreCase(stringInv.toString()) && stringg.length() != 1) {
			System.out.println(stringg + " es Palindromo.");
		} else {
			System.out.println(stringg + " no es Palindromo.");
		}
	}

}
