
package bin;

/**
 * クラスの基本
 * クラスの定義　10/13
 * 
 *　ライブラリーを使ってみる　11/13
 *
 * main.java
 */
public class ClassDefinition {
	public static void main(String[] args) {
		//printData(fullName("Kate", "Jones"), 27, 1.6, 50.0);
	    //printData(fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
		
		PersonNew.printData(PersonNew.fullName("Kate", "Jones"), 27, 1.6, 50.0);
		PersonNew.printData(PersonNew.fullName("John", "Christopher","Smith"),65, 1.75, 80.0);
		
	  
	}

}

