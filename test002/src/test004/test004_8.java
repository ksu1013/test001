package test004;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class test004_8 {
	//한계가 정해져있지 않으면 while문을 사용
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count=0;

        
       while (true) {
    	   
    	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
				
			
			bw.write((x + y) + "\n");
			if(count==4) {
				break;
			}
			count++;
       }
        
       bw.flush();

    }

	
}

