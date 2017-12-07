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
 * Bicycle.java = Tea.java
 * Vehicle.java （スーパークラス）
 * Person.java = Person.java
 */

/**
 * 継承とは「既存のクラスのフィールドやメソッドを別のクラスに引き継ぐ機能」
 * 継承して出来る新しいクラスには独自のフィールドやメソッドを追加してカスタマイズが可能。
 * 継承されるクラスをスーパークラスと呼ぶ。
 *  
 */

abstract class Drink {
	private String name;
	private String from;
	protected int count = 0;
	// インスタンスフィールドownerを定義してください
	/**
	 * フィールドにインスタンスを持つことが可能。
	 * 下のようにPerson型のownerというインスタンスフィールドを持つようにする。
	 * フィールドを作成したらゲッターとセッターを定義する（以下に記入）
	 */
	private Person owner;
	
	// Drinkクラスのコンストラクタを定義する
	/**
	 * コンストラクタとは　newを使ってインスタンスを生成（　「new クラス名（）」）した後に自動で呼び出される特別なメソッド
	 * 【コンストラクタの定義】
	 * 　①コンストラクタ名はクラスと同じにるす
	 * 　②戻り値を書いてはいけない（void）
	 */
	Drink(String name, String from, int count){
		this.name = name;
		this.from = from;
		this.count = count;
	}
	
	//ゲッター
	public String getName() {
		return  this.name;
	}
	public String getFrom() {
		return this.from;
	}
	public int getCount() {
		return this.count;
	}
	// ownerのゲッターを定義
	public Person getOwner() {
		return this.owner;
	}
	
	//セッター
	public void setName(String name) {
		this.name = name;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public void setCount(int count) {
		this.count = count;
	}
	// ownerのゲッターを定義
	public void setOwner(Person person) {
		this.owner = person;
	}
	
	public void printData() {
		System.out.println("名前：" + this.name);
		System.out.println("生産地：" + this.from);
		System.out.println("容量：" + this.count + "ml");
		
	}
	// 抽象メソッドrunを定義してください
	/**
	 * 処理が未定なメソッドを定義する場合は「抽象メソッド」を使う。
	 * abstractをメソッドの先頭に付ける。
	 * 途中からabstractに変更する場合は、classの前にあるpublicをabstractに変更する。
	 */
	abstract public void run(int count);

}
