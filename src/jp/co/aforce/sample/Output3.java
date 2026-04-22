package jp.co.aforce.sample;

public class Output3 {
	public static void main (String[] args) {
		boolean p = false;
		boolean q = true;
		boolean r = !(p || q)&& (p && !q);
		System.out.println(r);
	}

}
