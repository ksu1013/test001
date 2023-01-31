package test004;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class test004_9 {
	//한계가 정해져있지 않으면 while문을 사용
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        
       while (true) {
    	   
    	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
				
			if (x == 0 && y == 0) {
				break;
			}
			bw.write((x + y) + "\n");
       }
        
       bw.flush();

    }

	
}

