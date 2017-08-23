package string;

public class ObjString {
	private char charac;
	private int num;
	
	public ObjString(char charac, int num) {
		this.charac = charac;
		this.num = num;
	}

	public char getCharac() {
		return charac;
	}

	public int getNum() {
		return num;
	}
	
	public void incNum() {
		this.num++;
	}
}
