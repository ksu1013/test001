package test004;

import java.util.Scanner;
public class test004_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("x를 입력하시오");
		int x=sc.nextInt();
		System.out.println("n를 입력하시오");
		int n=sc.nextInt();
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("a를 입력하시오");
			int a=sc.nextInt();
			System.out.println("b를 입력하시오");
			int b=sc.nextInt();
			
			x-=(a*b);
		}
		
		if(x==0)System.out.println("Yes");
		else System.out.println("No");
	
	}

	
}

