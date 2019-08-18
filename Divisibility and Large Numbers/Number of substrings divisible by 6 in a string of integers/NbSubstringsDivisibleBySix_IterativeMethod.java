public class NbSubstringsDivisibleBySix_IterativeMethod {

	static void print(int startIndex, int sndIndex, int currDigitSum, char[] s) {
		StringBuilder sb = new StringBuilder();
		for (int k = startIndex; k <= sndIndex; k++) {
			sb.append(s[k]);
		}
		System.out.println(sb.toString() + ", start: " + s[startIndex] + " (" + startIndex + "), end: " + s[sndIndex]
				+ " (" + sndIndex + ")" + ", currDigitSum: " + currDigitSum);
	}

	static int countDivBySixFromStartIndex(int startIndex, char[] s) {
		int result = 0;
		int digitSum = 0;
		for (int j = startIndex; j < s.length; j++) {
			int x = s[j] - '0';

			boolean digitDivisibleByTwo = x % 2 == 0;
			digitSum += x;
			boolean sumDivisibleByThree = digitSum % 3 == 0;

			if (digitDivisibleByTwo && sumDivisibleByThree) {
				print(startIndex, j, digitSum, s);
				result++;
			}
		}
		return result;
	}

	// Returns substrings divisible by 6.
	static int countDivBySix(String numberAsString) {
		char[] s = numberAsString.toCharArray();
		
		int result = 0;

		int n = s.length;
		for (int i = 0; i < n; i++) {
			if (s[i] == '0') {
				// we do not want to take into account numbers with leading zeros.
				// So we increment the counter since 0 is divisible by six.
				// Then we jump to the next digit.
				result++;
				continue;
			}

			result += countDivBySixFromStartIndex(i, s);
		}

		return result;
	}
	
	static void printResult(String numberAsString, int result) {
		System.out.println();		
		System.out.println("*******************************************");
		System.out.println("For string " + numberAsString + "; Total of substrings divisible by six: " + result);
		System.out.println("*******************************************");
		System.out.println();				
	}

	// Driven Program
	public static void main(String[] args) {
		String s1 = "4806";
		// expected result: 5
		// Substrings: "0", "6", "48", "480", "4806"
		int resultS1 = countDivBySix(s1);
		assert resultS1 == 5;
		printResult(s1, resultS1);
		
		String s2 = "606";
		// expected result: 5
		// Substrings: "6", "0", "6", "60", "606"
		int resultS2 = countDivBySix(s2);

		assert resultS2 == 5;
		printResult(s2, resultS2);
	
	}

}
