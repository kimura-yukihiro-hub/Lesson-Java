package jp.co.aforce.sample;

public class NegativeValue {
	public static void main (String[] args) {
		int num = -5;
		if (num < 0) {
			//負の数だった時の処理
			System.out.println(num + "は負の数である。");
		} else {
			System.out.println(num + "は正の数である。");
		}
	}

}
