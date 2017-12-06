/**
 * 
 */
package bin;

/**
 * 自己紹介プログラムを作ろう
 * 
 * クラスメソッド　14/21
 *
 * main.java  = ClassMethod.java
 * person.java 
 */

public class PersonNine {
	public static int count = 0;
	//public Sting firstName,lastName;
	public String firstName;
	public String lastName;
	public int age;
	//public double height,weight;
	public double height;
	public double weight;
	
	PersonNine(String firstName, String lastName, int age, double height, double weight){
		this.firstName = firstName;
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
		System.out.println("年齢は" + age + "歳です");
		System.out.println("BMIは" + Math.round(this.bmi()) + "です");
	}
	
	public static void printCount() {
		System.out.println("合計" + PersonNine.count + "人です");
	}
	
	

}
