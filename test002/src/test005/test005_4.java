package test005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test005_4{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer>list=new ArrayList<Integer>();
		for (int i = 0; i < 9; i++) {
			String k=br.readLine();
			list.add(Integer.parseInt(k));
			
		}
		System.out.println(list);
		int max=Collections.max(list);
		
		System.out.println(max);
		System.out.println(list.indexOf(max)+1);
	}
}
