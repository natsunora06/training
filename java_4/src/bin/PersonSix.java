
package bin;

/**
 * 自己紹介プログラムを作ろう
 * 
 * インスタンスメソッド　11/21
 *
 * main.java = InstanceMethodSecond.java
 * person.java
 */

public class PersonSix {
	public String firstName;
	public String lastName;
	public int age;
	public double height;
	public double weight;
	
	PersonSix(String firstName, String lastName, int age, double height, double weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	}
	
	// fullNameのメソッドを定義する
	public String fullName() {
		return firstName + " " + lastName;
	}
	
	// bimのメソッドを定義する
	public double bmi() {
		return weight / height / height;
	}

}
