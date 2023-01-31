package test007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test007_8 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		String[] kk=sc.nextLine().split(" ");
		
		
		StringBuffer sb = new StringBuffer(kk[0]);
		StringBuffer sb2 = new StringBuffer(kk[1]);
        String reversedStr = sb.reverse().toString();
        String reversedStr2 = sb2.reverse().toString();
		
        int k1=Integer.parseInt(reversedStr);
        int k2=Integer.parseInt(reversedStr2);
        
        if(k1<k2) {
        	System.out.println(k2);
        }else {
        	System.out.println(k1);
        }
        
		
		
	}

}
