package bin;
/**
 * カプセル化を学ぼう
 * 
 * ゲッター　19/21
 *
 * main.java 
 * person.java = Peple.java
 */
public class Get {
	public static void main(String[] args) {
		People person1 = new People("Kate", "Jones", 27, 1.6, 50.0);
		person1.printData();
		
		People person2 = new People("John", "Christopher", "Smith", 65, 1.75, 80.0);
		person2.printData();
		
		System.out.println("---------------------------");
		
		//person2に対して、getMiddleNameメソッドを呼び出し、「person2のミドルネームは〇〇です」と出力
		System.out.println("person2のミドルネームは" + person2.getMiddleName()+"です");
		
	}

}
