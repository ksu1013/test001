package test004;

import java.util.Iterator;
import java.util.Scanner;

public class test004_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("a를 입력하시오");
		int a=sc.nextInt();
		
		int[]k= {1,2,3,9,5};
		int[]r= {1,3,4,8,2};
		
		for (int i = 0; i < a; i++) {
			System.out.println(k[i]+r[i]);
		}
		
		
	}
}
