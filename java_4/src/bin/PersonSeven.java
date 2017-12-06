
package bin;

/**
 * 自己紹介プログラムを作ろう
 * 
 * インスタンスメソッド(2)　12/21
 *
 * main.java = InstanceMethodThrid.java
 * person.java 
 */
public class PersonSeven {
	public String firstName;
	public String lastName;
	public int age;
	public double height;
	public double weight;
	
	PersonSeven(String firstName, String lastName, int age, double height, double weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	}
	
	public String fullName() {
		return this.firstName + " " + this.lastName;
	}
	
	public double bmi() {
		return this.weight / this.height / this.height ;
	}
	
	// printDataのメソッドを定義する（メソッドの戻り値なし）
	public void printData() {
		System.out.println("私の名前は" + this.fullName() + "です");
		System.out.println("年齢は" + age + "歳です");
		
		//四捨五入する「Math.roung(引数)」
		System.out.println("BMIは" + Math.round(this.bmi()) + "です");
	}

}
