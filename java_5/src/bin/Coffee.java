/**
 * 
 */
package bin;

/**
 * オリジナル
 * @since 2017/12/7
 * 
 * Main.java = Main.java
 * Car.java （サブクラス）
 * Bicycle.java = Tea.java
 * Vehicle.java = Drink.java
 * Person.java = Person.java
 */

/**
 * 継承とは「既存のクラスのフィールドやメソッドを別のクラスに引き継ぐ機能」
 * 継承して出来る新しいクラスには独自のフィールドやメソッドを追加してカスタマイズが可能。
 * 継承して出来る新しいクラスをサブクラスと呼ぶ。
 * サブクラスのインスタンスは、自身のクラスに定義したメソッドだけでなく、
 * スーパークラスのメソッドも呼び出すことが可能。（継承は一方的なため、逆は無理） 
 *  
 */
//このクラスは継承を用いてクラスを定義する
public class Coffee extends Drink{
   //「class サブクラス extends スーパークラス名」←定義の仕方
	
	private int sugar = 10;
	
	// Coffeeクラスのコンストラクタを定義し、スーパークラス（Drink）のコンストラクタを呼び出す
	Coffee(String name, String from, int count){
		super(name, from, count);
		//superには引数（name,from,count）を渡す
	}
	
	public int getSugar() {
		return this.sugar;
	}
	//printDataメソッドを定義する
	public void printData() {
		/**
		 * sugar以外のフィールド（name, from, count）はゲッターを使って取得する。
		 * Drinkクラスにprivateなフィールドとして定義してあるため、
		 * 外部のクラスであるCoffeeクラスは直接アクセスすることはできない。（カプセル化）
		 * 
		 * ↓カプセル化された情報を引き出している
		 * 　System.out.println("名前：" + this.getName());
		 * 　System.out.println("生産地：" + this.getFrom());
		 * 　System.out.println("容量：" + this.getCount() + "ml");	
		 */
		//	上記のSystem〜　をまとめたものを以下に書く
		super.printData();
		/**
		 * 「super.メソッド名（）」スーパークラス(Drinkクラス)のインスタンスメソッドを呼び出すことが出来る
		 * 　上記の方法でDrinkクラスからprintDataメソッド（name,form,count）を呼び出すことができる。
		 */
		
		System.out.println("砂糖の量：" + this.sugar + "g");
	}	
	
	public void run(int count) {
		System.out.println(count + "ml飲みます");
		if(count <= this.sugar) {
			this.count += count;
			this.sugar -= count;
		}else {
			System.out.println("砂糖の量が多すぎます");
		}
		System.out.println("容量：" + this.count + "ml");
		System.out.println("砂糖の量：" + this.sugar + "g");
	}
	
	public void charge(int gram) {
	    System.out.println(gram + "g入れます");
	    if (gram <= 0) {
	      System.out.println("砂糖無しです");
	    } else if (gram + this.sugar >= 100) {
	      System.out.println("あるだけ入れます");
	      this.sugar = 100;
	    } else {
	      this.sugar += gram;
	    }
	    System.out.println("砂糖の量：" + this.sugar + "g");
	  }

}
