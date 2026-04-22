package jp.co.aforce.sample;

public class EvenOrOdd {
	public static void main (String[] args) {
		int num = 7;
		//2で割った余りが0と等しいか判定
		boolean isEvenOrOdd = (num % 2 == 0);
		if (isEvenOrOdd) {
			System.out.println(num + "は偶数です。");
		} else {
			System.out.println(num + "は奇数です。");
		}
	}

}
