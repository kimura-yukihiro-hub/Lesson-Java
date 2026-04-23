package jp.co.aforce.sample;

public class GreaterThanTen {
	public static void main (String[] args) {
		int num = 12;
		//比較演算の結果をboolean変数に代入
		boolean isGreaterThanTen = num > 10;
		//boolean変数の値を使って条件分岐
		if (isGreaterThanTen) {
			System.out.println(num + "は10より大きいです。");
		} else {
			System.out.println(num + "は10より小さいです。ss");
		}
		System.out.println("判定結果" + isGreaterThanTen);
	}

}
