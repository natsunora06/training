
package bin;

/**
 * 自己紹介プログラムを作ろう
 * 
 * コンストラクタを呼び出す　16/21
 * fullNameメソッドを書き換えよう 17/21
 *
 * main.java 
 * person.java = PersonEleven.java
 */
public class ConstructorCall {
	public static void main(String[] args) {
		PersonEleven person1 = new PersonEleven("Kate", "Jones", 27, 1.6, 50.0);
		person1.printData();
		
		PersonEleven person2 = new PersonEleven("John", "Christopher", "Smith", 65, 1.75, 80.0);
		person2.printData();
		
		PersonEleven.printCount();
	}

}

