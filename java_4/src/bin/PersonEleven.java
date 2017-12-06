
package bin;

/**
 * 自己紹介プログラムを作ろう
 * 
 * コンストラクタを呼び出す　16/21
 * fullNameメソッドを書き換えよう 17/21
 *
 * main.java = ConstructorCall.java
 * person.java 
 */
public class PersonEleven {
	public static int count = 0;
	public String firstName;
	public String middleName;
	public String lastName;
	public int age;
	public double height;
	public double weight;
	
	PersonEleven(String firstName, String lastName, int age, double height, double weight){
		PersonEleven.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	PersonEleven(String firstName,String middleName, String lastName, int age, double height, double weight){
		this(firstName, lastName, age, height, weight);
		this.middleName = middleName;
	}
	
	// ここを書き換える　--スタート--
	public String fullName() {
		//以下をmiddleNameが無い場合と、ある場合で条件分岐を行う
		if(this.middleName == null) {
			return this.firstName + " " + lastName;
		}else {
			return this.firstName + "" + this.middleName + "" + this.lastName;
		}
	}
	public double bmi() {
		return this.weight / this.height / this.height ;
	}
	
	public void printData() {
		System.out.println("私の名前は" + this.fullName() + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "mです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("BMIは" + Math.round(this.bmi()) + "です");
	}
	public static void printCount() {
		System.out.println("合計" + PersonEleven.count + "人です");
	}
	
	

}
