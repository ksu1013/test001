package test007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test007_9 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		String[] kk=sc.nextLine().toLowerCase().split("");
		List<Integer> list=new ArrayList<Integer>(kk.length);
		
		
		
		int check=2;
		int k2=0;
		
		
		
		String a="abc";
		String b="def";
		String c="ghi";
		String d="jkl";
		String e="mno";
		String f="pqrs";
		String g="tuv";
		String h="wxyz";
		
		
		
		
		for (int i = 0; i < kk.length; i++) {
			if(a.contains(kk[i])) {
				k2=check+1;
			}else if(b.contains(kk[i])) {
				k2=check+2;
			}else if(c.contains(kk[i])) {
				k2=check+3;
			}else if(d.contains(kk[i])) {
				k2=check+4;
			}else if(e.contains(kk[i])) {
				k2=check+5;
			}else if(f.contains(kk[i])) {
				k2=check+6;
			}else if(g.contains(kk[i])) {
				k2=check+7;
			}else if(h.contains(kk[i])) {
				k2=check+8;
			}
			list.add(k2);
		} 
		
		int sum = 0;
		for(int i : list)
		    sum += i;
		System.out.println(sum);
		
		
	}

}
