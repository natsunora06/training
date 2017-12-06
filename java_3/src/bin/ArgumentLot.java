package bin;
/**
 * メソッド（１）
 * 複数の引数　4/13
 */
public class ArgumentLot {
	public static void main(String[] args) {
		
		//年齢に関する引数を追加
		printData("Kate Jones",27);
		printData("John Christopher Smith",65);
		}
	
	public static void printData(String name, int age) {
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		
		
	}

}
