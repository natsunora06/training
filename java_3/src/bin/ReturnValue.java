
package bin;

/**
 * メソッド（２）
 * メソッドの戻り値　5/13
 * 
 * 戻り値とは・・・・
 * メソッドの処理結果を、メソッドの呼び出し元で使用したい場合、
 * メソッドが戻り値を返すようにする。
 */
public class ReturnValue {
	public static void main(String[] args) {
		
		// fulNameメソッドの結果を変数nameに代入
		String name = fullName("Kate" , "Jones");
		System.out.println(name);

		printData("Kate Jones",27);
		
		//　下１文は書き換えなし
		printData("John Christopher Smith",65);
		}
	
	public static void printData(String name, int age) {
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age + "歳です");
	}

		//　メソッドの戻り値 fullNameメソッドを定義
		public static String fullName(String firstName, String lastName){
			return firstName + " " + lastName;
		
		
	}

}
