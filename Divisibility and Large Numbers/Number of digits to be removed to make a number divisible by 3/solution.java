/*
* Given a very large number num (1 <= num <= 10^1000),
* we have to print the number of digits that needs to be removed to make the number exactly divisible by 3.
* If it is not possible we should print -1.
*/

/*
* We know that a number is multiple of 3 if and only if the sum of its digits is multiple of 3.
* 
* There are three situations to deal with.
*
* 1) The sum of digits modulo 3 is equal to zero. So no digits have to be removed.
* 2) The sum of digits modulo 3 is different of zero, but there exists a digit d such as d mod 3 = sum mod 3
*      > This digit d is the one to remove, because (sum - d) modulo 3 = 0
* 3) The sum of digits modulo 3 is different of zero AND no digit is equal to the sum modulo 3.
*
* So sum mod 3 = 1  OR  sum mod 3 = 2 
*
* Case sum mod 3 = 1.
* ===================
*
*  a) num is made of digits d_i  such as d_i modulo 3 = 0 ou d_i modulo 3 = 2
*  b) There can't be only digits d_i such as d_i modulo 3 = 0,
*    because the sum of these d_i would necessarly be equal to 0. k * d_i modulo 3 = 0
*  c) There can't be only one digit d_i such as d_i modulo 3 = 2 and the others are equal to 0 modulo 3
*    because the sum of these d_i +dj would necessarly be equal to 2. d_i + k * d_j mod 3 = 2 + 0 + ... + 0 = 2 mod 3
*
*  ==> So there are necessarly at least 2 digits d_i and d_j such as d_i = d_j = 2 mod 3
*  So (d_i + d_j) mod 3 = (2 + 2) mod 3 = 4 mod 3 = 1 mod 3. 
*
*
*  So (sum - (d_i + d_j) ) mod 3 = 0
*
*
*
*
* Case sum mod 3 = 2.
* ===================
* a) and b) Same proof
*
* Similarly there exist two digits d_i and d_j such as d_i = d_j = 1 mod 3
*  So (d_i + d_j) mod 3 = (1 + 1) mod 3 = 2 mod 3
*
*
*  So (sum - (d_i + d_j) ) mod 3 = 0
*
*/

public class DivByThreeDigitRemover {
	static int divisible(String num) {
		int n = num.length();

		// Sum up all the digits of num.
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += (int) (num.charAt(i));
		}

		if (sum % 3 == 0) {
			// CASE 1:
			// The sum of digits modulo 3 is equal to zero. So no digits have to
			// be removed.
			return 0;
		}	
		// if there is single digit,
		// then it is not possible
		// to remove one digit.
		if (n == 1) {
			return -1;
		}

		// CASE 2
		// Traverse through the number
		// and find out if any number
		// on removal makes the sum
		// divisible by 3
		for (int i = 0; i < n; i++) {
			if (sum % 3 == (num.charAt(i) - '0') % 3) {
				return 1;
			}
		}	
		
		// If there are two numbers
		// then it is not possible
		// to remove two digits.
		if (n == 2) {
			return -1;
		}
		// CASE 3
		// Otherwise we can always
		// remove 2 digits
		// and make the resulting number divisible by 3.
		return 2;
	}

	// Driver Code
	public static void main(String[] args) {

		String num = "1234";
		System.out.println(divisible(num));
	}
}

