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

public class test005_6{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			String k=br.readLine();
			
			list.add(k);
		}
		
		for (int i = 0; i < list.size(); i++) {
			int kk=Integer.parseInt(list.get(i));
			list2.add(String.valueOf(kk%42));
		}
		 List<String> newList = list2.stream().distinct().collect(Collectors.toList());
		System.out.println(newList.size());
	}
}

