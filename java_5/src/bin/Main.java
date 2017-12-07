package bin;
/**
 * オリジナル
 * @since 2017/12/7
 * 
 * Main.java
 * Car.java = Coffee.java
 * Bicycle.java = Tea.java
 * Vehicle.java = Drink.java
 * Person.java = Person.java
 */

class Main {
	public static void main(String[] args) {
		Person person1 = new Person("Emma", 20, "女性");
		Person person2 = new Person("Ken", 50, "男性");
		
		Coffee coffee = new Coffee("ハウスブレンド","ブラジル",500);
		/**
		 *  setOwnerを用いてcoffeeを買った人をperson1
		 *  coffee.setOwner(person1);		
		 */

		// buyメソッドを用いて、person1にcoffeeを購入させてください
		person1.buy(coffee);
				
		Tea tea = new Tea("ダージリン","インド",400);
		/**
		 *  setOwnerを用いてteaを買った人をperson2
		 *  tea.setOwner(person2);
		 */
		// buyメソッドを用いて、person2にteaを購入させてください
		person2.buy(tea);
		
		System.out.println("【 コーヒーの情報 】");
		coffee.printData();
		System.out.println("-----------------");
		System.out.println("【　コーヒーを買った人の情報　】");
		// getOwnerメソッドを用いてcoffeeのownerを取得し、
	    // さらにprintDataメソッドを用いてownerの情報を出力してください
	    coffee.getOwner().printData();
	    
		//System.out.println("容量を入力してください：");
		// int coffeeCount = scanner.nextInt();
	    
	    // runメソッドを呼び出して、引数にcoffeeCountを渡してください
		/**
		 * runメソッドはそれぞれのクラスで処理が異なる。
		 * Drinkクラスに定義して継承するのではなく、それぞれのサブクラスに独自のメソッドとして追加する。
		 * ーーーーーー注意点ーーーーーー
		 * 元のコード（スーパークラスで使っていたコード）をそのまま追加するとエラーが出る。
		 * privateフィールドに直接アクセスできないため元のコードにprivateを使用している場合は、
		 * privateをprotectedに変えるとクラス内とサブクラスからのみアクセスを許すフィールドを作ることができる。
		 * 結論、runメソッドを使用したい場合にエラーが出たら、
		 * 元のコードを確認しprivateを使用していないかを見る。
		 * 使用していたらprotectedに変更する。
		 */
		//coffee.run(coffeeCount);
		
		//System.out.println("砂糖の量を入力してください：");
		//int gram = scanner.nextInt();
		//coffee.charge(gram);
		
		System.out.println("=================");
		
		System.out.println("【 紅茶の情報 】");
		tea.printData();
		System.out.println("-----------------");
		System.out.println("【　紅茶を買った人の情報　】");
		//System.out.println("容量を入力してください：");
		//int teaCount = scanner.nextInt();
		// runメソッドを呼び出して、引数にteaCountを渡してください
		//tea.run(teaCount);
		
		// getOwnerメソッドを用いてteaのownerを取得し、
	    // さらにprintDataメソッドを用いてownerの情報を出力してください
	    tea.getOwner().printData();
	}
	
	}
