
package bin;

import java.util.Scanner;
//　コンソールへの入力を受け取るにはScanner（ライブラリー）を使う


/**
 * クラスの基本
 * 入力を受け取ろう（１）　12/13
 */
public class Input {
	public static void main (String[] args) {
		
		                  //　↓スキャナーの初期化
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("名前: ");
		
		              // ↓文字列の入力を受け取る
		String name = scanner.next();
		
		System.out.println("こんにちは" + name +"さん");
	}

}
