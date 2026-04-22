package jp.co.aforce.sample;

public class Output2 {
	public static void main (String[] args) {
		boolean x = true;
		boolean y = false;
		boolean z = x || y && !x;
		System.out.println(z);
	}

}
