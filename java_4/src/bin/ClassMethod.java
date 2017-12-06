
package bin;

/**
 * 自己紹介プログラムを作ろう
 * 
 * クラスメソッド　14/21
 *
 * main.java 
 * person.java = PersonNine.java
 */
public class ClassMethod {
	public static void main(String [] args) {
		PersonNine person1 = new PersonNine("Kate", "Jones", 27, 1.6, 50.0);
		person1.printData();
		
		PersonNine person2 = new PersonNine("John", "Smith",65, 1.75, 80.0);
		person2.printData();
		
		// printCountメソッドを呼び出す
		PersonNine.printCount();
	}

}
