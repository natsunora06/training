
package bin;

/**
 * 自己紹介プログラムを作ろう
 * 
 * 目標を確認しよう　 9/21
 * フィールドとコンストラクタ　10/21
 *
 * main.java  = FeildAndConstructor.java
 * person.java 
 */

public class PersonFifth {
	
	//　インスタンスフィールドを定義
	public String firstName;
	public String lastName;
	public int age;
	public double height;
	public double weight;
	
	//　コンストラクタを定義し、インスタンスフィールドに値をセットする
	PersonFifth(String firstName, String lastName, int age, double height, double weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

}
