
package bin;

/**
 * 自己紹介プログラムを作ろう
 * 
 * クラスフィールド　13/21
 *
 * main.java 
 * person.java = PersonEight.java
 */
public class ClassFeild {
	public static void main(String[] args) {
		PersonEight person1 = new PersonEight("Kate", "Jone", 27, 1.6, 50.0);
		person1.printData();
		
		PersonEight person2 = new PersonEight("John", "Smith", 65, 1.75, 80.0);
		person2.printData();
		
		System.out.println("合計" + PersonEight.count + "人です");
	}

}
