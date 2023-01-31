package test003;

import java.util.Scanner;

public class test003_4 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("x를 입력하세요");
		int a=sc.nextInt();
		System.out.println("y를 입력하세요");
		int b=sc.nextInt();
		
		if((a>=-1000&a<=1000&a!=0)&(b>=-1000&b<=1000&b!=0)) {
			if(a>0&b>0)System.out.println("1");
			else if(a<0&b>0)System.out.println("2");
			else if(a<0&b<0)System.out.println("3");
			else System.out.println("4");
			
		}else System.out.println("x,y는 -1000보다 크거나 같고 1000보다 작거나 같고 0은 안됩니다.");
		
	
		
	}

}
