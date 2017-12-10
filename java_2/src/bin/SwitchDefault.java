
package bin;

/**
 *  条件分岐
 *  switch文(2)  7 / 15
 */
public class SwitchDefault {
	public static void main(String[] args) {
		int number = 13;
		
		switch(number % 5) {
		  case 0:
			  System.out.println("大吉です");
			  break;
		  
		  case 1:
			  System.out.println("中吉です");
			  break;
			  
		  case 4:
			  System.out.println("凶です");
			  break;
			  
		  /**
		   * switch文では、どのcaseとも一致しなかったときに実行する処理を、defaultに指定することができます。
		   */
		  default:
			  System.out.println("吉です");
			  break;
		
		}
	}

}
