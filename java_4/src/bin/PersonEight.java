
package bin;

/**
 * 自己紹介プログラムを作ろう
 * 
 * クラスフィールド　13/21
 *
 * main.java = ClassFeild.java
 * person.java 
 */

public class PersonEight {
	
	/**
	 * フィールドには定義時に初期値を設定しておくことができる　
	 * countはインスタンスの生成回数
	 */
	public static int count = 0;
	
	public String firstName;
	public String lastName;
	public int age;
	// public double height,weight;　でも良い。
	public double height;
	public double weight;
	
	PersonEight(String firstName, String lastName, int age, double height, double weight){
		// 変数countに１を足す
		PersonEight.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public String fullName() {
		return this.firstName + " " + this.lastName;
	}
	public double bmi() {
		return this.weight / this.height / this.height;
	}
	public void printData() {
		System.out.println("私の名前は" + this.fullName() +"です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("BMIは" + Math.round(this.bmi()) + "です");
	}

}
