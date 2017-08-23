package string;

import java.util.ArrayList;

public class Stringg {
	private StringBuilder stringg;
	private ArrayList<ObjString> resul = new ArrayList<ObjString>();
	private ArrayList<Character> aux = new ArrayList<Character>();
	
	/** La complejidad es N, debido al uso del for.
	 */
	
	public Stringg(final StringBuilder dato) {
		this.stringg = dato;
	}

	void resolver(){
		int index;
		for (int i = 0; i < stringg.length(); i++) {
			if (!aux.contains(stringg.charAt(i))) {
				resul.add(new ObjString(stringg.charAt(i),1));
				aux.add(stringg.charAt(i));
			} else {
				((ObjString) resul.get(aux.indexOf(stringg.charAt(i)))).incNum();
			}
		}
		index = buscarMax();
		System.out.println(((ObjString)resul.get(index)).getCharac());
	}

	private int buscarMax() {
		int max = 0;
		int index = 0;
		for (int i = 0; i < stringg.length(); i++) {
			if (((ObjString) resul.get(aux.indexOf(stringg.charAt(i)))).getNum() > max){
				max = ((ObjString) resul.get(aux.indexOf(stringg.charAt(i)))).getNum();
				index = aux.indexOf(stringg.charAt(i));
			}
		}
		return index;
	}
}
