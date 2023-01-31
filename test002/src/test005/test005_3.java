package test005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class test005_3{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String k=br.readLine();
		String k2=br.readLine();
		
		int kk=Integer.parseInt(k);
		String[] arr=k2.split(" ");
		int[] kk2=new int[arr.length];
		for (int i = 0; i < kk; i++) {
			kk2[i]=Integer.parseInt(arr[i]);
		}
		System.out.println(">>>>>"+Arrays.stream(kk2).min().getAsInt());
		System.out.println(">>>>>"+Arrays.stream(kk2).max().getAsInt());
		
		
		
		//int[]arr= {3,1,40,2,5,237,4};
		
		//Arrays.stream(arr).max().getAsInt();

	}
}
