package test005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class test005_5{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list =new ArrayList<String>();
		ArrayList<String> list2 =new ArrayList<String>();
		ArrayList<Integer> list3 =new ArrayList<Integer>();
		
		
		for (int i = 0; i < 28; i++) {
			String k=br.readLine();
			list2.add(k);
		}
		for (int i = 1; i <= 30; i++) {
			list.add(String.valueOf(i));
		}
		for (int i = 0; i <30; i++) {
			if(list2.indexOf(list.get(i))<=-1) {
				list3.add(Integer.parseInt(list.get(i)));
				
			}
		}
		
		 int max = Collections.max(list3);	
		 int min = Collections.min(list3);	
		 
		 System.out.println(min);
		 System.out.println(max);
		
	}
}
