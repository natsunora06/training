package bin;
/**
 *  配列
 *  
 *  配列と繰り返し  13 / 15
 *  配列用のfor文  14 / 15
 */
public class ArrayRepetition {
	public static void main(String[] args) {
		String names[] = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};
		
		/**
		 * lengthメソッド
		 * 配列には、要素の数を数えるlengthという機能が備わっている。
		 * lengthは、「配列.length」のようにドット（.）でつないで用いる。
		 * lengthを用いれば、先ほどのfor文の条件式「i < 3」を下図のように書き換えることができ、配列の要素数を気にする必要がなくなる。
		 */
		// 通常for文
		for(int i = 0; i < names.length; i++) {
			System.out.println("私の名前は" + names[i] + "です");
		}
		
		// 拡張for文
		for(String name:names) {
			System.out.println("私の名前は" + name + "です");
		}
	}

}
