package test002;

import java.util.Scanner;

public class test002_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("첫번째 수 를 입력하세요");
		int a=sc.nextInt();
		System.out.println("두번째 수를 입력하세요");
		int b=sc.nextInt();
		
		int temp1 = b /100%10; // 100의 자리 //3
        System.out.println("b/100%10 : " + temp1);
        int temp2 = b /10%10; // 10의 자리 //8
        System.out.println("b/10%10 : " + temp2);
        int temp3 = b%10; // 1의 자리  //5
        System.out.println("b%10 : " + temp3);
        
        //385/100/10
		
        System.out.println("a * 1의자리(temp3) : " + a * temp3);
        System.out.println("a * 10의자리(temp2) : " + a * temp2);
        System.out.println("a * 100의자리(temp1) : " + a * temp1);
        System.out.println("a * b : " + a * b);
		
		
	}
}
