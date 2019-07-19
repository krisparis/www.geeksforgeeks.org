/**
 * For large numbers it is difficult to rotate and divide each number by 4.
 * Therefore, ‘divisibility by 4’ property is used which says that a number is
 * divisible by 4
 * 
 * If the last 2 digits of the number is divisible by 4. 
 * Here we do not actually rotate the number and check last 2 digits for
 * divisibility,
 * 
 * Instead we count consecutive pairs (in circular way) which are divisible by 4.
 */ 
 
/**
 * 
 * Illustration:
 * Consider a number 928160.
 * Its rotations are 928160, 092816, 609281, 160928, 816092, 281609.
 * 
 * Now form pairs from the original number 928160 as mentioned in the approach.
 * 
 * Pairs: (9,2), (2,8), (8,1), (1,6), (6,0), (0,9)
 * 
 * We can observe that the 2-digit number formed by the these pairs, i.e., 92, 28, 81, 16, 60, 09, are present in the last 2 digits of some rotations.
 * 
 * Thus, checking divisibility of these pairs gives the required number of rotations. 
 * Note: A single digit number can directly be checked for divisibility.
 * 
 */ 
 
 // Java program to count 
// all rotations divisible 
// by 4. 
import java.io.*; 

class Solution { 
	
	// Returns count of all 
	// rotations divisible 
	// by 4 
	static int countRotations(String n) 
	{ 
		int len = n.length(); 
	
		// For single digit number 
		if (len == 1) 
		{ 
		int oneDigit = n.charAt(0)-'0'; 

		if (oneDigit % 4 == 0) 
			return 1; 

		return 0; 
		} 
	
		// At-least 2 digit 
		// number (considering all 
		// pairs) 
		int twoDigit, count = 0; 
		for (int i = 0; i < (len-1); i++) 
		{ 
		twoDigit = (n.charAt(i)-'0') * 10 + 
					(n.charAt(i+1)-'0'); 

		if (twoDigit%4 == 0) 
			count++; 
		} 
	
		// Considering the number 
		// formed by the pair of 
		// last digit and 1st digit 
		twoDigit = (n.charAt(len-1)-'0') * 10 + 
				(n.charAt(0)-'0'); 

		if (twoDigit%4 == 0) 
			count++; 
	
		return count; 
	} 
	
	//Driver program 
	public static void main(String args[]) 
	{ 
		String n = "4834"; 
		System.out.println("Rotations: " + 
						countRotations(n)); 
	} 
} 
