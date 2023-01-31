package test007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test007_7 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String[] k=bf.readLine().split(" ");
		int k2=k.length;
		if(k2==0) {
			System.out.println(0);
		}else if(k[0].equals("")) {
			System.out.println(k2-1);
		}else {
			System.out.println(k2);
		}
		
	}

}
