
package bin;

/**
 * 自己紹介プログラムを作ろう
 * 
 * コンストラクタのオーバーロード　15/21
 *
 * main.java 
 * person.java = PersonTen.java
 */
public class OverRoad {
	public static void main(String[] args) {
		PersonTen person1 = new PersonTen("Kate","Jones", 27, 1.6, 50.0);
		person1.printData();
		
		PersonTen person2 = new PersonTen("John", "Christopher", "Smith", 65, 1.75,80.0);
		person2.printData();
		
		PersonTen.printCount();
	}
}
