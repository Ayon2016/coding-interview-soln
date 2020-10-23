package com.practice.chapterone;

import java.util.Scanner;

public class YoutubeProblems {
 //Practice Problems from https://www.youtube.com/watch?v=-Xa6b_2lkM0
	
	public static void reverseString(String str) {
		if(!str.isEmpty()) {
			char[] strCharArray = str.toCharArray();
			StringBuilder builder = new StringBuilder();
			for(int i =str.length()-1; i>=0;i--) {
				builder.append(strCharArray[i]);
			}
			System.out.println(builder);
		}
		else {
			System.out.println("Please check the format of the String");
		}
		
	}
	
	public static void reverseWordsofString(String str, String delimeter) {
		if(!str.isEmpty()) {
			String[] strArray = str.split(delimeter);
			int lengthofSentence = strArray.length;
			StringBuffer buffer = new StringBuffer();
			for (int i=0; i<=lengthofSentence-1;i++) {
				int length = strArray[i].length();
				char[] str2 = strArray[i].toCharArray();
				for(int j=0;j<=length-1;j++) {
					buffer.append(str2[length-1-j]);
				}
				if(i==lengthofSentence-1) {
					break;
				}
				else {
					buffer.append(delimeter);
				}
			}
			System.out.println(buffer);
		}
		
		else {
			System.out.println("Please check the Format of the String");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//reverseString(in.nextLine());
		reverseWordsofString(in.nextLine()," ");
	}
}
