package test005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class test005_7{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Double> list2 = new ArrayList<Double>();
		
		String k=br.readLine(); //시험 개수
		String kk=br.readLine(); // 각 시험점수
		
		
		int k2=Integer.parseInt(k);
		String[] kk2=kk.split(" ");
		
		for (int i = 0; i < k2; i++) {
			int kk3=Integer.parseInt(kk2[i]);
			list.add(kk3);
		}
		
		int max = Collections.max(list);	
		System.out.println(max);
		 
		for (int i = 0; i < k2; i++) {
		 int k4=list.get(i);
		 list2.add((double)k4/max*100);
		}
		System.out.println(list2);
		
		Double sum=(double) 0;
		for (Double num:list2) {
			sum += num;
		}
		System.out.println((double)sum / list2.size());
		
		
	}
}

