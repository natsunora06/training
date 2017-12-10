
package bin;

/**
 *  条件分岐
 *  switch文  6 / 15
 */
public class Switch {
	public static void main(String[] args) {
		int number = 12;
		
		/**
		 * switch文では、()の中の条件の値と、caseの値が「==」になるとき、処理が実行される。
		 * switch文は、「とある値（今回はx % 2）が何であるか」で処理を分けたいとき（特にその分岐が多いとき）、if文よりシンプルに書くことができる。
		 * 
		 */
		switch(number % 3) {
		 // caseの後は（：）コロンを置く。
		 case 0:
		 System.out.println("3で割り切れます");
		 // breakはswitch文を終了する命令。
		 break;
		
		 case 1:
		 System.out.println("3で割ると1余ります");
		 break;
		
		 case 2:
		 System.out.println("3で割ると2余ります");
		 break;
		}
	}

}
