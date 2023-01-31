package test003;

import java.util.Scanner;

public class test003_3 {
	public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("연도를 입력하세요");
			int a=sc.nextInt();
			
			if(a%4==0&&a%100==1||a%400==0)System.out.println("1");
			else System.out.println("0");
			
		}

}
