package com.practice.chapterone;

public class StringPractice {
	//This Practice is from PluralSight, and Youtube
	//https://www.youtube.com/watch?v=N63JCXwdd14
	//revision from https://app.pluralsight.com/course-player?clipId=27386189-8923-4381-985b-7559af0c1bf2
	public static void stringEqualityCompareTo() {
		String s1 = "I Love";
		s1 = s1+" Java";
		String s3 = s1.intern();
		
		//Strings variables hold a reference to an instance of a String
		//Strings are immutable
		//When an existing string is modified, Java creates a new instance of a string
		//The reference is re-pointed to the new String
		
		String s2 = "I Love Java";
		String s4 = s2.intern();
		
		if(s1.compareTo(s2)==0) {
			System.out.println("s1 is equal to s2 using compareTo");
		}
		
		if(s1.equals(s2)) {
			System.out.println("s1 is equal to s2 using Equals");
		}
		
		//Intern method is can be used for Object comparison and gives better performance
		if(s3==s4) {
			System.out.println("s1 is equal to s2 using Intern");
		}
	}
	
	public static void stringMethods() {
		String str = "Ayon loves technology";
		//Length
		System.out.println("String Length is " +str.length());
		
		//Character at, index is 0 to length-1
		System.out.println("First Char is "+ str.charAt(0)+" and Last Char is " + str.charAt(str.length()-1));
		
		//toUpperCase() and toLowerCase()
		str.toUpperCase();
		System.out.println("str after upper case is " + str);// No changes will happen to str: Strings are IMMUTABLE
		System.out.println("No changes will happen to str: Strings are IMMUTABLE");
		String s1 = str.toUpperCase();
		System.out.println(s1);
		
		//Contains
		if(str.contains("Ayon")) {
			System.out.println("String contains Ayon");
		}
		
		//Substring: public String substring(int beginIndex,int endIndex).
		//Returns a string that is a substring of this string. 
		//The substring begins at the specified beginIndex and extends to the character at index endIndex - 1.
		String s2 = str.substring(6,str.length());
		System.out.println(s2);
		
		//Replace
		String s3 = str.replace('A','M');
		
		//toCharArray: To split the String into an array of chars
		char[] toCharArray = str.toCharArray();
		for(char ch: toCharArray) {
			System.out.print(ch + " ");
		}
		System.out.println();
		
		//Split: to spit the String into an array if Strings using a regex
		//trim: to remove whitespace
		String[] names = str.split(" "); //Splitting based on whitespace
		for(String s:names) {
			System.out.print(s.trim() + " ");
		}
		System.out.println();
		
		//isEmpty
		if(!str.isEmpty()) {
			System.out.println("This is not an empty String");
		}
		
		StringBuilder builder = new StringBuilder("Mutable");
		builder.append(" String");
	}
	
	public static void main(String[] args) {
		stringEqualityCompareTo();
		stringMethods();
	}
	
}
