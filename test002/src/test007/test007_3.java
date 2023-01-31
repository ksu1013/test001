package test007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class test007_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String k=bf.readLine();
		
		
		String az= "abcdefghijklmnopqrstuvwxyz";
		String[] az2=az.split("");
		
		for (int i = 0; i < az2.length; i++) {
			k.indexOf(az2[i]);
			System.out.print(k.indexOf(az2[i])+" ");
		}
		
		for(char a = 'a'; a<='z'; a++) {
			
			System.out.print(k.indexOf(a)+" ");
			
			
		}
		
	
	}
}
