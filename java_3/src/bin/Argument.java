
package bin;

/**
 * メソッド（１）
 * 引数を使おう　3/13
 */

public class Argument {
	public static void main(String[] args) {
		/**
		 * 引数に「Kate Jones」（各名前）を渡す。
		 * 引数とはメソッドに与える追加情報のこと。
		 */
		printData("Kate Jones");
		printData("John Christopher Smith");
	}
	
	//　引数を受け取るメソッド
	public static void printData(String name) {
	    /**
	     * この場合の仮引数 は「String name」になる。
	     * 仮引数とは引数を受け止めるための箱。
	     */
		
		System.out.println("私の名前は" + name + "です");
		
	}

}
