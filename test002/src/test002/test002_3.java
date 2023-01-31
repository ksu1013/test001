package test002;

import java.util.Scanner;

public class test002_3 {

	public static void main(String[] args) {
		String kk="joonas";
		String kk2="baekjoon";
		Scanner sc=new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String a=sc.next();
		if(a.equals(kk)) {
			System.out.println(kk+"??!");
		}else if(a.equals(kk2)) {
			System.out.println(kk2+"??!");
		}
		
		
	}
}
