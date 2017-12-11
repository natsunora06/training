package bin;
/**
 * クラスの基本
 * 入力を受け取ろう（２）　13/13
 * 
 * main.java
 * person.java = PersonSecond.java
 */

import java.util.Scanner;

public class Java3sTask {
	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("名前：");
	    // 文字列の入力を受け取ってください
	    String firstName = scanner.next();
	    
	    System.out.print("名字：");
	    // 文字列の入力を受け取ってください
	    String lastName = scanner.next();
	    
	    System.out.print("年齢：");
	    // 整数の入力を受け取ってください
	    int age = scanner.nextInt();
	    
	    System.out.print("身長(m)：");
	    // 小数の入力を受け取ってください
	    double height = scanner.nextDouble();
	    
	    System.out.print("体重(kg)：");
	    // 小数の入力を受け取ってください
	    double weight = scanner.nextDouble();
	    
	    PersonSecond.printData(PersonSecond.fullName(firstName, lastName), age, height, weight);
	  }
	}




