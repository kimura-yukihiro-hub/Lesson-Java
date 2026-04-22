package jp.co.aforce.sample;

public class Output1 {
	public static void main (String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = (a && b) || (!a && !b);
		System.out.println(c);
	}

}
