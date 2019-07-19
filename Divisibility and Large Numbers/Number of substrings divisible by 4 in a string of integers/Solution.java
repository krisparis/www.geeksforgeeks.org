/**
 * A number is divisible by 4 if its last two digits are divisible by 4
 * and single digit numbers divisible by 4 are 4, 8 and 0 .
 * 
 * So, to calculate number of substrings divisible by 4 we first count number of 0’s, 4’s and 8’s in the string .
 * Then, we make all pairs of two consecutive characters and convert it into integer.
 * 
 * After converting it into integer we check that whether it is divisible by 4 or not.
 * If it is divisible by 4 then all such substring ending with this last two characters are divisible by 4 .
 * 
 * Now, number of such substrings are basically the index of 1st character of pair. 
 * 
 * To make it more clear, consider string “14532465” 
 * then possible pairs are “14”, “45”, “53”, “32”, “24”, “46”, “65” .
 * In these pairs only “32” and “24” when converted into integer are divisible by 4 
 * Then, substrings ( length >= 2 ) divisible by 4 must end with either “32” or “24”.
 * 
 * So, number of substrings ending with “32” are “14532”, “4532”, “532”, “32” i.e 4 and index of ‘3’ is also 4.
 * 
 * Similarly, number of substrings ending with “24” are 5.
 * 
 * Thus we get an O(n) solution.
 */ 


// Java program to count number of substrings 
// divisible by 4 
import java.io.*;

class Solution {
	// Function to count number of substrings
	// divisible by 4
	static int countDivisbleby4(String s) 
	{ 
		int n = s.length(); 
	
		// In the first loop we will count number of 
		// 0's, 4's and 8's present in the string 
		int count = 0; 
		for (int i = 0; i < n; ++i) {
			if (s.charAt(i) == '4' || s.charAt(i) == '8' || s.charAt(i) == '0') {
				count++ ; 
			}
		}
		// In second loop we will convert pairs 
		// of two consecutive characters into 
		// integer and store it in variable h . 
		// Then we check whether h is divisible by 4 
		// or not . If h is divisible we increases 
		// the count with ( i + 1 ) as index of 
		// first character of pair 
		for (int i = 0; i < n - 1; ++i) 
		{ 
			int h = ( s.charAt(i) - '0' ) * 10 + ( s.charAt(i+1) - '0' ); 
			if (h % 4 == 0) {
				count = count + i + 1 ; 
			}
		} 

		return count; 
	}

	// driver program
	public static void main(String[] args) {
		String s = "124";
		System.out.println(countDivisbleby4(s));
	}
}
