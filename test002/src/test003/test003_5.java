package test003;

import java.util.Scanner;

public class test003_5 {
	public static void main(String[] args) {
		int h=0;
		int m=0;
		int t=45;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("H를 입력해주세요");
		h=sc.nextInt();
		System.out.println("M를 입력해주세요");
		m=sc.nextInt();
		
		if(m>=t) {
			System.out.println(h+":"+(m-t));
		}else if(m<t) {
			if(h==0)System.out.println(23+":"+(60-(t-m)));
			else System.out.println((h-1)+":"+(60-(t-m)));
		}
		
		
	}

}
