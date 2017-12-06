package bin;

public class FeildAndConstructor {

	/**
	 * 自己紹介プログラムを作ろう
	 * 
	 * 目標を確認しよう　 9/21
	 * フィールドとコンストラクタ　10/21
	 *
	 * main.java 
	 * person.java = PersonFifth.java
	 */
	
	public static void main(String[] args) {
			PersonFifth person1 = new PersonFifth("Kate", "Jones", 27, 1.6, 50.0);
			
			System.out.println(person1.firstName);
			System.out.println(person1.lastName);
			System.out.println(person1.age);
			System.out.println(person1.height);
			System.out.println(person1.weight);
		}

	}


