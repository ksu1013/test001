package test005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test005_2{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String target = br.readLine();   //첫번째 입력 값 : N과 X
		String x = br.readLine(); 		// 두번째 입력값 : n개로 이루어진 수열
		
		String[] s=target.split(" ");
		
		int s1=Integer.parseInt(s[0]);
		int s2=Integer.parseInt(s[1]);
		
		String[] kk=x.split(" "); 
		
		for (int i = 0; i < s1; i++) {
			
			int k1=Integer.parseInt(kk[i]);
			
			if(k1<s2) {
				System.out.print(k1+" ");
			}
			
			
		}
		
		

	}
}
