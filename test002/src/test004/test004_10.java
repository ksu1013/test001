package test004;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class test004_10 {
	//이거는 다시 해보기 !!!!
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=null;
        
       while (true) {
    	   
    	   st = new StringTokenizer(br.readLine());
			
			String x = st.nextToken();
			
			if(x.length()==1)x="0"+x;
			int k=Integer.parseInt(x.substring(0,1));
			int j=Integer.parseInt(x.substring(1,2));
			
			String u2=String.valueOf(k+j);
			System.out.println(u2);
			//break;
			
			
			if(!x.equals(u2)) {
				if(u2.length()==1) {
					x=String.valueOf(j)+u2;
				}else {
					x=String.valueOf(j)+u2.substring(1, 2);
				}
			}else break;
			
			
       }
        

    }

	
}

