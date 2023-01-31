package test004;

import java.util.Scanner;

public class test004_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("a를 입력하시오");
		int a=sc.nextInt();
		
		for (int i = 1; i <=9; i++) {
			System.out.println(a +"x"+i+"="+(a*i));
		}
		
		
	}
}
