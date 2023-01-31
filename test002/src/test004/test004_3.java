package test004;

import java.util.Scanner;
//for문에 대해서 다시 이해하기 !!!!
public class test004_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("a를 입력하시오");
		int a=sc.nextInt();
		//int k=a+(a-1)+(a-2)...+1
		//int k=a+(a-n)+1
		int k=0;
		for (int i = 1; i < a+1; i++) {
			k+=i;
		}
		System.out.println(k);
	}

	
}

