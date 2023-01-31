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
//이거는공부가 필요!!!
public class test005_8{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list=new ArrayList<String>();
		
		int count=0;
		String k=br.readLine(); 
		int n=Integer.parseInt(k);
		//String k2=br.readLine();
		//System.out.println(k2.length());
		for (int i = 0; i <n; i++) {
			String k2=br.readLine();
			for (int j = 0; j < k2.length(); j++) {
				if(k2.indexOf("o")>-1) {
					System.out.println(k2.indexOf("O"));
				}
			}
			
			list.add(String.valueOf(count));
			
		}
		System.out.println(list);
		
		
		
		
	}
}

