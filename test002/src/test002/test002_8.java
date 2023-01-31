package test002;

import java.util.Scanner;

public class test002_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("A를 입력하세요");
		int a=sc.nextInt();
		System.out.println("B를 입력하세요");
		int b=sc.nextInt();
		System.out.println("C를 입력하세요");
		int c=sc.nextInt();
		
		if(a>=2&a<=10000&b>=2&b<=10000&c>=2&c<=10000) {
			System.out.println(((a+b)%c));
			System.out.println(((a%c)+(b%c))%c);
			System.out.println(((a*b)%c));
			System.out.println(((a%c)*(b%c))%c);
		}else {
			System.out.println("a,b,c는 2보다 크거나 같고 10000보다 작거나 같습니다.");
		} 
		
		
	}
}
