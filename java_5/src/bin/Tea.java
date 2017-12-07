/**
 * 
 */
package bin;

/**
 * オリジナル
 * @since 2017/12/7
 * 
 * Main.java = Main.java
 * Car.java = Coffee.java
 * Bicycle.java　（サブクラス）
 * Vehicle.java = Drink.java
 * Person.java = Person.java
 */

/**
 * 継承とは「既存のクラスのフィールドやメソッドを別のクラスに引き継ぐ機能」
 * 継承して出来る新しいクラスには独自のフィールドやメソッドを追加してカスタマイズが可能。
 * 継承して出来る新しいクラスをサブクラスと呼ぶ。
 *  
 */
public class Tea extends Drink{
	// Teaクラスのコンストラクタを定義し、スーパークラス（Drink）のコンストラクタを呼び出す
	Tea(String name, String from, int count){
		super(name, from, count);
	}
	public void run(int count) {
		System.out.println(count + "ml飲みます");
		this.count += count;
		System.out.println("容量：" + this.count + "ml");
	}

}
