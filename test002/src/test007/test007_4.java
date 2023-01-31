package test007;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
public class test007_4 {
	//문자열 반복 나중에 공부!!!
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list =new ArrayList<String>();
		ArrayList<String> list2 =new ArrayList<String>();
		
		String k=bf.readLine();
		int kk=Integer.parseInt(k);
		String[] ui=null;
		for (int i = 0; i < kk; i++) {
			String kkk=bf.readLine();
			String uk=kkk;
			list.add(uk);
		}
		
		
		
	}
}
