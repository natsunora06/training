package bin;

/**
 * カプセル化を学ぼう
 * 
 * カプセル化 18/21
 *
 * main.java 
 * person.java = PersonTwelve.java
 */
public class Capsule {
	public static void main(String[] args) {
		PersonTwelve person1 = new PersonTwelve("Kate", "Jones", 27, 1.6, 50.0);
		person1.printData();
		
		PersonTwelve person2 = new PersonTwelve("John", "Christopher", "Smith", 65, 1.75, 80.0);
		person2.printData();
		
		PersonTwelve.printCount();
	}

}

