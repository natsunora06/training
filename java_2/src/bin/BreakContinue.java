package bin;
/**
 *  繰り返しの処理
 *  break, continue  10 / 15
 */
public class BreakContinue {
	public static void main(String[] args) {
		System.out.println("==== wihe文 ====");
		
		int i = 1;
		while(i < 10) {
			if(i % 5 == 0) {
				//　繰り返し処理を終了
				break;
			}
			System.out.println(i);
			i++;
		}
		
		System.out.println("==== for文 ====");
		
		for(int j =1; j < 10; j++) {
			if( j % 3 == 0) {
				
				/**
				 * continueはその周の処理だけをスキップして、次の周を実行することができる。
				 */
				continue;
			}
			System.out.println(j);
		}
	}

}
