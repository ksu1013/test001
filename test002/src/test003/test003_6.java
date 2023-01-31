package test003;

import java.util.Scanner;

public class test003_6 {
	public static void main(String[] args) {
		int h=0;
		int m=0;
		int mm=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("H를 입력해주세요");
		h=sc.nextInt();
		System.out.println("m을 입력해주세요");
		m=sc.nextInt();
		System.out.println("mm를 입력해주세요");
		mm=sc.nextInt();
		
		int k=(m+mm)/60;
		
		if((m+mm)<=59) System.out.println(h +":"+ (m+mm));
		else if((m+mm)%60==0) System.out.println((h+k)+":"+0);
		else System.out.println(Math.abs(24-(h+k)) +":"+((m+mm-60)%60));
			
		
		
		
		
		
		}

}
