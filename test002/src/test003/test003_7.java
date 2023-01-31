package test003;

import java.util.Scanner;

public class test003_7 {
	public static void main(String[] args) {
		
		int a=0;
		int b=0;
		int c=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("a의 값을 입력하시요");
		a=sc.nextInt();
		System.out.println("b의 값을 입력하시요");
		b=sc.nextInt();
		System.out.println("c의 값을 입력하시요");
		c=sc.nextInt();
		
		if(a==b&a==c)System.out.println(10000+a*1000);
		else if(b==c||a==c||a==b) System.out.println(1000+mid(a,b,c)*100);
		else System.out.println(max(a,b,c)*100);
		
		}

	private static int mid(int a, int b, int c) {
		if(a==b||a==c)return a;
		else return b;
		
	}

	private static int max(int a, int b, int c) {
		if(a>b&a>c)return a;
		else if(b>a&b>c) return b;
	    else return c;
		
	}

}
