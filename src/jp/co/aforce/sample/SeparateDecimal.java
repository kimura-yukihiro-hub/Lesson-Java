package jp.co.aforce.sample;

class SeparateDecimal {
	public static void main (String[] args) {
		double num = 7.8;
		//1. 整数部分
		int integerPart = (int) num;
		//2. 小数部分
		double decimalPart = num - integerPart;
		System.out.println("整数部分:" + integerPart);
		System.out.println("小数部分:" + decimalPart);
	}

}
