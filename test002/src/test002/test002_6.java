package test002;

import java.util.Scanner;

public class test002_6 {

	public static void main(String[] args) {
		int king =1;
		int queen=1;
		int rook=2;
		int bi=2;
		int ni=2;
		int pon=8;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("king 의 개수를 입력하세요");
		int a=sc.nextInt();
		System.out.println("queen 의 개수를 입력하세요");
		int b=sc.nextInt();
		System.out.println("rook 의 개수를 입력하세요");
		int c=sc.nextInt();
		System.out.println("bi 의 개수를 입력하세요");
		int d=sc.nextInt();
		System.out.println("ni 의 개수를 입력하세요");
		int e=sc.nextInt();
		System.out.println("pon 의 개수를 입력하세요");
		int f=sc.nextInt();
		
		if(a>=0&b>=0&c>=0&d>=0&e>=0&f>=0) {
			System.out.println((king-a));
			System.out.println((queen-b));
			System.out.println((rook-c));
			System.out.println((bi-d));
			System.out.println((ni-e));
			System.out.println((pon-f));
		}else {
			System.out.println("a,b,c,d,e,f는 0보다 크고 10보다 작거나 같습니다.");
		}
		
		
		
		
		
	}
}
