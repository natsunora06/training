
package bin;

/**
 *  条件分岐
 *  if文  4 / 15
 */
public class ConditionalBranch {
	public static void main(String[] args) {
		//　条件式に直接trueを入れる
		if(true) {
			System.out.println("条件式がtrueのため、出力されます");
		}
		//　条件式に直接falseを入れる
		if(false) {
			System.out.println("条件分岐がfalseのため、出力されません");
		}
		
		int x = 5;
		if( x > 2) {
			System.out.println("xは2より大きい");
		}
		if(x > 8) {
			System.out.println("xは8より大きい");
		}
	}

}
