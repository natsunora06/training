/**
 * 
 */
package bin;

/**
 * オブフェクト指向
 * コンストラクタ（２）8/21
 *
 * main.java = ConstructorSecond.java
 * person.java 
 */
public class PersonForth {
	
	public String name;
	
	// コンストラクタがString型の引数を受け取るようにうする
	
	PersonForth(String name){
		System.out.println("インスタンスが生成されました");
		this.name = name;
	}
	
	public void hello() {
		System.out.println("こんにちは、私は" + this.name + "です");
	}

}
