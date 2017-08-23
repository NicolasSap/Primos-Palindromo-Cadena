package primos;

public class Primos {
	private int piso;
	private int tope;
	private boolean[] resul;
	
	/** La complejidad es N log log N.
	 */
	
	public Primos(final int piso, final int tope) {
		this.piso = piso;
		this.tope = tope;
		resul = new boolean[tope+1];
	}
	
	void resolver() {
		for (int i = 2; i <= Math.sqrt(tope); i++) {
			if (!resul[i]) {
				for (int j = i; j <= (tope/i); j++) {
					resul[(i*j)] = true;
				}				
			}
		}
		for (int i = piso; i < resul.length; i++) {
			if (!resul[i]) {
				System.out.println(i);
			}
		}
	}
}
