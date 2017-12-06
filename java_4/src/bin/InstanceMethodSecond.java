
package bin;

/**
 * 自己紹介プログラムを作ろう
 * 
 * インスタンスメソッド　11/21
 *
 * main.java 
 * person.java = PersonSix.java
 */

public class InstanceMethodSecond {
	public static void main(String[] args) {
		
		PersonSix person1 = new PersonSix("Kate", "Jones", 27 ,1.6, 50.0);
		
		System.out.println(person1.fullName());
		System.out.println(person1.age);
		System.out.println(person1.bmi());
	}
	

}
