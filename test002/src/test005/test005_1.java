package test005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test005_1 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()); // 첫번째 입력 값 : 배열의 크기
		

		String target = br.readLine();		// 두번째 입력 값 : 타겟
		
		String compareNumber = br.readLine();	//	세번째 입력 값 : 비교할 숫자
		
		String[] arr = new String[n];
		int count = 0; // 몇개가 나왔는지? 출력 값
		
		
		for(int i = 0; i < n; i ++) {
			arr = target.split(" ");
			
			if(arr[i].equals(compareNumber)){
				count++;
			}
//			System.out.println("arr["+i+"] : "+ arr[i]);
		}
		System.out.println(count);
	}
}
