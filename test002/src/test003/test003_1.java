package test003;

import java.util.Scanner;

public class test003_1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("시험점수를 입력하세요");
		int a=sc.nextInt();
		
		
		if(90<=a&a<100)System.out.println("A");
		else if(80<=a&a<=89)System.out.println("B");
		else if(70<=a&a<=79)System.out.println("C");
		else if(60<=a&a<=69)System.out.println("D");
		else System.out.println("F");
		
		
	}

}
