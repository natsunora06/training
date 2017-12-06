/**
 * 
 */
package bin;

/**
 * 自己紹介プログラムを作ろう
 * 
 * クラスメソッド　14/21
 *
 * main.java = OverRoad.java
 * person.java 
 */
public class PersonTen {
	public static int count = 0;
	public String firstName;
	//　インスタンスフィールドmiddleNameの定義　
	public String middleName;
	public String lastName;
	public int age;
	public double height, weight;
	
	PersonTen(String firstName,  String lastName, int age, double height,double weight){
		PersonTen.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	//middleNameを受け取るコンストラクタの定義
	PersonTen(String firstName, String middleName, String lastName, int age, double height,double weight){
		PersonTen.count++;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String fullName() {
		return this.firstName + " " + this.lastName ;
	}
	public double bmi() {
		return this.weight / this.height / this.height;
	}
	
	public void printData() {
		System.out.println("私の名前は" + this.fullName() +"です");
		System.out.println("年齢は" + age +"歳です");
		System.out.println("BMIは" + Math.round(this.bmi()) + "です");
	}
	public static void printCount() {
		System.out.println("合計" + PersonTen.count + "人です");
	}

}
