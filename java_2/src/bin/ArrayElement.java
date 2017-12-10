package bin;
/**
 *  配列
 *  配列の要素の上書き  12 / 15
 */

public class ArrayElement {
	public static void main(String[] args) {
		
		String[] languages = {"Ruby", "PHP", "Python"};
		
		  // インデックス番号が「1」の要素を出力してください
		System.out.println(languages[1]);
		
		languages[1] = "Java";
		System.out.println(languages[1]);
	}

}
