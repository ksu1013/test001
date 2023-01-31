package test007;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test007_6 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		int iFlag = 0;
		String strParsing;
		strParsing = in.next().toUpperCase();
		int[] strFlag = new int[strParsing.length()];
		String[] strArray = new String[strParsing.length()];
		strArray = strParsing.split("");

		for (int i = 0; i < strArray.length; i++) {
			for (int y = 0; y < strArray.length; y++) {
				if (strArray[i].compareTo(strArray[y]) == 0) {
					strFlag[i]++;
				}
			}
			list.add(strFlag[i]);
		}
		for (int i = 0; i < strParsing.length(); i++) {
			if (Collections.max(list) == list.get(i)) {
				if (strArray[list.indexOf(Collections.max(list))].equals(strArray[i])) {
				} else {
					iFlag = 1;
				}
			}
		}
	
		if (iFlag == 0) {
			System.out.println(strArray[list.indexOf(Collections.max(list))]);
		} else {
			System.out.println("?");
		}
		
	}
}
