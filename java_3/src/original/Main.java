package original;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // ----------アレンジ---------
    
    
    System.out.print("名前：");
    
    // 文字列の入力を受け取ってください
    /**
     * scanner.-----();の----がnextの場合は文字列、
     * nextIntの場合はデータ型。
     * 
     */
    String firstName = scanner.next();
    
    System.out.print("名字：");
    // 文字列の入力を受け取ってください
    String lastName = scanner.next();
    
    System.out.print("年齢：");
    System.out.print("＊上記に数字を入力してください");
    //if() {
   // 	 System.out.println("");
    //}else {
    	// System.out.println("");
   // }

    // 整数の入力を受け取ってください
    int age = scanner.nextInt();
    
    System.out.print("身長(m)：");
    // 小数の入力を受け取ってください
    double height = scanner.nextDouble();
    
    System.out.print("体重(kg)：");
    // 小数の入力を受け取ってください
    double weight = scanner.nextDouble();
    
    Person.printData(Person.fullName(firstName, lastName), age, height, weight);
  }
}


