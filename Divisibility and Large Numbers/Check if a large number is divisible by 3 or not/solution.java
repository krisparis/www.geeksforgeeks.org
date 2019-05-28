package misc;

/**
 * Java program to find if a number is divisible by 3 or not
 */
public class Main {
	// Function to find that number
	// divisible by 3 or not
	static boolean check(String str) {
		// Compute sum of digits
		int n = str.length();
		int digitSum = 0;

		for (int i = 0; i < n; i++) {
			// str.charAt(i) is converted to int due to the "-" operator.
			// It gives the ASCII code of the character.
			// The ASCII code of 0 (49) and 9(58).
			// We use that to get the numeric value of the character
			digitSum += str.charAt(i) - '0';
		}
		// Check if sum of digits is
		// divisible by 3.
		return (digitSum % 3 == 0);
	}

	// main function
	public static void main(String[] args) {
		String str = "1332";
		if (check(str)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
