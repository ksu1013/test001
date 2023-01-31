package test007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
public class test007_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list =new ArrayList<String>();
		ArrayList<String> list2 =new ArrayList<String>();
		ArrayList<Integer> list3 =new ArrayList<Integer>();
		String k=bf.readLine();
		int iFlag=0;
		int max=0;
		String[] str2 = k.toUpperCase().split("");
		
		for (int i = 0; i < str2.length; i++) {
			list.add(str2[i]);
			
		}
		
		System.out.println("list>>>>>>>"+list);
		Set<String> set = new HashSet<String>(list);
		System.out.println("set>>>"+set);
        for (String str : set) {
            list2.add(str);
            list3.add(Collections.frequency(list, str));
	    }
        System.out.println(list3);
	    max=Collections.max(list3);
	    
	    for (int i = 0; i < list3.size(); i++) {
            for (int j = 0; j < i; j++) {
            	if (max == list3.get(i)) {
	                if (list3.get(i).equals(list3.get(j))) {  // 중복 검사
	                	
	                }else {
	    					iFlag = 1;
	    			}
                
            	}
            }
           
        }
	    
	    if (iFlag == 0) {
			System.out.println(str2[list.indexOf(max)]);
		} else {
			System.out.println("?");
		}
	    
	   
	     
	       
	        
		
	}
}
