package test007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class test007_2 {
public static void main(String[] args) throws IOException {
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	ArrayList<String> list =new ArrayList<String>();
	
	
	String k=bf.readLine();
	String k3=bf.readLine();
	
	String[] k4=k3.split("");
	for (int i = 0; i < k4.length; i++) {
		list.add(k4[i]);
		
	}
	 int sum = 0;
	 // 합계: 반복문을 사용하여 변수에 값을 누적합니다.
	for (String num: list) {
		int num2=Integer.parseInt(num);
	        sum += num2;
	}
	
	System.out.println(sum);
}
}
