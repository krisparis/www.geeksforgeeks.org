/**
 * Arithmetic series formula: n * (a1 + an) / 2,
 * where n is the number of terms
 * a1 the first term of the series
 * an the last term of the series
 * 
 * So sum of all the numbers divisible by 6 up to R is
 * sumR = 6 + 12 + 8 + …… +(R/6) terms.
 * sumR = 6 * (1 + 2 + 3……R/6 terms)
 * sumR = 6 * (R/6  * (1 + R/6)/2 )
 * sumR = 6 * R/6  * (1 + R/6)/2 
 * sumR = 3 * R/6  * (1 + R/6)
 * 
 * similarly we get sum of all the numbers divisible by 6 up to L-1:
 * sumL = 3 * (L - 1)/6  * (1 + (L - 1/6)
 * and the final answer as sumR – sumL
 * sumR - sumL = 3 * R/6  * (1 + R/6) - [3 * (L - 1)/6  * (1 + (L - 1/6)]
 */
 
 // Java program to find sum of numbers 
// divisible by 6 in a given range. 
import java.io.*; 
class Solution { 

// function to calculate the sum 
// of all numbers divisible by 6 
// in range L-R.. 
static int sum(int L, int R) 
{ 
	// no of multiples of 6 upto r 
	int p = R / 6; 

	// no of multiples of 6 upto l-1 
	int q = (L - 1) / 6; 

	// summation of all multiples of 
	// 6 upto r 
	int sumR = 3 * (p * (p + 1)); 

	// summation of all multiples of 
	// 6 upto l-1 
	int sumL = (q * (q + 1)) * 3; 

	// returns the answer 
	return sumR - sumL; 
} 

// driver program 
public static void main(String[] args) 
{ 
	int L = 1, R = 20; 
	System.out.println(sum(L, R)); 
} 
} 

