
package bin;

/**
 * 真偽値と条件式
 * 真偽値・比較演算子　1 / 15
 */
public class Main {
	public static void main(String[] args) {
		System.out.println(true);
		System.out.println(false);
		
		System.out.println( 12 / 4 == 3);
		System.out.println( 12 / 4 != 3);
		
		boolean bool = true;
		bool = 3 * 9 == 27;
		
		System.out.println(bool);

/**
* 真偽値と条件式
* 比較演算子( 2 )　2 / 15
*/		
		//false
		System.out.println(8 < 5);
		
		//true
		System.out.println(3 >= 2);
	
/**
* 真偽値と条件式
* 論理演算子 　3 / 15
*/	
		/**
		 * && (かつ)　「条件1 && 条件2」
		 * 　　true && false = false
		 * 
		 * || (または)　「条件1 || 条件2」
		 *    true || false = true
		 */
		//true 
		System.out.println(true || false);
		
		//false
		System.out.println(true && false);
		
		
		// 「8 < 5」かつ「3 >= 2」の結果を出力してください
		System.out.println(8 < 5 && 3 >= 2);
		
		// 「8 < 5」または「3 >= 2」の結果を出力してください
		System.out.println(8 < 5 || 3 >= 2);
		
		// 「8 < 5」でない、の結果を出力してください
		// !を用いると「〜でない」を表現する
		System.out.println(!(8 < 5 ));
		
		
		
		
		
		
	}
}
