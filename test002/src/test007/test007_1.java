package test007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//아스키코드 순선 : String -> char -> int
public class test007_1 {
public static void main(String[] args) throws IOException {
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	char k=bf.readLine().charAt(0);
	int num=k;
	System.out.println(num);
	
}
}
