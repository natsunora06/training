/**
 * 
 */
package bin;

/**
 *  条件分岐
 *  else, else if  5 / 15
 */

public class ElseIf {
	public static void main(String[] args) {
		int number = 12;
		
		// else ifは必要なだけ並べることができますが、複数の条件に合致しても、実行されるのは最初に合致した条件だけなので注意する
		if(number < 10) {
			System.out.println("10より小さい");
		}else if(number < 20) {
			System.out.println("10以上、20より小さい");
		}else{
			System.out.println("20以上");
		}
	}

}
