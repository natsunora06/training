
package bin;

/**
 * オブジェクト指向の基本
 * 
 * This　6/21
 * コンストラクタ（１） 7/21
 * 
 * main.java = This.java
 * person.java
 */
public class PersonThird {
	public String name;
	
	PersonThird(){
		System.out.println("インスタンスが生成されました");
		
	}
	
	// staticはいらない↓
	public void hello(){
	System.out.println("こんにちは、私は" + this.name + "です");

}
}
