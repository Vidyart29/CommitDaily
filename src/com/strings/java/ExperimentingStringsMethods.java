package com.strings.java;

public class ExperimentingStringsMethods {


	
	public static void main(String[] args) {
//		strings in java
		
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String txt="ABCF";
//		System.out.println("lenght of string is: "+ str.length());
//		System.out.println(str.codePointCount(1, 25));
//		System.out.println(str.toLowerCase());
		System.out.println(str.compareTo(txt));			
/**
		Explanation of compareTo()
		the compareTo() method compares two strings lexicographically (i.e., based on the Unicode values of the characters). 
		The result of compareTo() is: 0 if the two strings are equal.
		
		Steps of comparison:
The first string (str) is "ABCDEFGHIJKLMNOPQRSTUVWXYZ", and the second string (txt) is "ABCF".
The compareTo() method compares the strings character by character in order:
'A' is compared to 'A' → they are equal.
'B' is compared to 'B' → they are equal.
'C' is compared to 'C' → they are equal.
'D' is compared to 'F' → 'D' has a lower Unicode value than 'F'.
Since 'D' is lexicographically smaller than 'F', the comparison stops here, and the result is based on this difference.

Unicode values:
'D' has a Unicode value of 68.
'F' has a Unicode value of 70.
Calculation:
The result of the comparison will be the difference in Unicode values:

68 - 70 = -2
	**/
		
		
		System.out.println(str.endsWith(txt));
	}

}
