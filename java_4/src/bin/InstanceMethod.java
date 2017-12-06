
package bin;

/**
 * オブジェクト指向の基本
 * 
 * クラス定義とインスタンスの生成　3/21
 * インスタンスメソッド　4/21
 * 
 * main.java
 * person.java = person.java
 */
public class InstanceMethod {
	public static void main(String[] args) {
		
		Person person1 = new Person();
		/**
		 * インスタンスメソッド＝インスタンスのメソッド
		 * 「インスタンス名.メソッド名()」
		 */
		person1.hello();
		
		Person person2 = new Person();
		person2.hello();
		
		
	}

}
