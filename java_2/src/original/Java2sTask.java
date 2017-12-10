package original;
/**
 *  課題に挑戦しよう
 *  総合課題  15 / 15
 */
public class Java2sTask {
	public static void main(String[] args) {
		int[] numbers = {1, 4, 6, 9, 13, 16};
		
		// 奇数
		int oddSum = 0;
		// 偶数
		int evenSum = 0;
		
		for(int number:numbers) {
			if(number % 2 == 0) {
		 // for文を用いて、配列numbersの偶数の和と奇数の和を求めてください
				evenSum += number;
				//evenSum = evenSum + number;
			}else {
				oddSum += number;
			}
			
			// ---- 拡張for文を用いない場合 ----
		    // for (int i = 0; i < numbers.length; i++) {
			//                 i < numbers.length; ==  i <= 13;
			
		    //   if (numbers[i] % 2 == 0) {
		    //     evenSum += numbers[i];　（evenSum = evenSum + number[i];）
		    //   } else {
		    //     oddSum += numbers[i];
		    //   }
		    // }
		}
		
		System.out.println("奇数の和は" + oddSum + "です");
		System.out.println("偶数の和は" + evenSum + "です");
	}

}
