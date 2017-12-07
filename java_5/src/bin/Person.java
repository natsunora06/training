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
 * Vehicle.java = Drink.java
 * Person.java 
 */
public class Person {
	private String name;
	private int age;
	private String gender;
	
	Person(String name, int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void printData() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年齢は" + this.age +"歳です");
		System.out.println("性別は" + this.gender + "です");

	}
	public void buy(Drink drink) {
		drink.setOwner(this);
	}
	/**
	 * 【詳細】
	 *  Coffee型の引数を受け取るbuyメソッドを定義する
	 *  public void buy(Coffee coffee) {
	 *  coffee.setOwner(this);
	 *  }
	 *  Tea型の引数を受け取るbuyメソッドを定義する
	 *  public void buy(Tea tea) {
	 *  tea.setOwner(this);
	 *  }
	 */
	
	// 
	

}
