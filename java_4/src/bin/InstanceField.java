
package bin;

/**
 * オブジェクト指向の基本
 * 
 * インスタンスフィールド 5/21
 * main.java
 * person.java = Person.java
 */
public class InstanceField {
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.hello();
		
		// 「インスタンス名.フィールド名」  .(ドッド)を用いてインスタンスへアクセス
		person1.name = "Kate Jones";
		System.out.println(person1.name);
		
		Person person2 = new Person();
		person2.hello();
		person2.name = "John Christopher Smith";
		System.out.println(person2.name);
	}
	

}
