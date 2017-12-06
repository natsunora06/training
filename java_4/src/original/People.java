/**
 * 
 */
package original;

/**
 * カプセル化を学ぼう
 * 
 * ゲッター　19/21
 *
 * main.java = Get.java
 * person.java 
 */

public class People {
	private static int count = 0;
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private double height;
	private double weight;
	private String gender;
	
	People(String firstName,  String lastName, int age, double height, double weight, String gender){
		People.count++;
		this.firstName = firstName; 
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		
	}
	People(String firstName, String middleName, String lastName, int age, double height, double weight, String gender){
		this(firstName, lastName, age, height, weight, gender);
		this.middleName = middleName;
	
	}
	
	// middleName　フィールドのゲッターを定義する
	public String getMiddleName() {
		return this.middleName;
	}
	
	public String fullName() {
		if(this.middleName == null) {
			return this.firstName + " " + this.lastName;
		}else {
			return this.firstName + " " + this.middleName + " " + this.lastName;
		}
	}
	public double bmi() {
		return this.weight / this.height / this.height ;
	}

	
	public void printData() {
		System.out.println("私の名前は" + this.fullName() + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("BMIは" + Math.round(this.bmi()) + "です");
		System.out.println("性別は" + this.gender + "です");
	}
	public void printCount() {
		System.out.println("合計" + People.count + "人です");
	}
	

}
