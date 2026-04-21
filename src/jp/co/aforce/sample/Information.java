package jp.co.aforce.sample;

import java.util.Scanner;

public class Information {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//データの入力
		System.out.print("名前を入力してください");
		String name = scanner.nextLine();

		System.out.print("年齢を入力してください");
		int age = scanner.nextInt();
		scanner.nextLine(); //改行の読み飛ばし

		System.out.print("誕生日を入力してください");
		String birthday = scanner.nextLine();

		// String.formatを使用してフォーマット済みの文字列を作成
		String profile = String.format("名前: %s, 年齢: %d歳, 誕生日: %s", name, age, birthday);
		System.out.println(profile);

		scanner.close();
	}

}
