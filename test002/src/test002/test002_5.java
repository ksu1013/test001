package test002;

import java.util.Scanner;

public class test002_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("불기년도를 입력하세요");
		int a= sc.nextInt();
		
		System.out.println("불기연도 " +a+ " 일 때"+" 서기연도는" +(a-553)+"입니다.");
		
	}
}
