package utils.looptricks;

public class Solution {

	static boolean isDivisibleBySix(String number) {
		// A number divisible by six is divisible by two and divisible by three.
		if (!isDivisibleByTwo(number)) {
			return false;
		}

		return isDivisibleByThree(number);
	}

	static boolean isDivisibleByTwo(String number) {
		// A number is divisible by two, if the number made of the last two digits is
		// divisible by two.
		int numLength = number.length();
		if (numLength == 1) {
			int num = Integer.parseInt(number);
			return num % 2 == 0;
		}
		String lastTwoDigitsNumber = number.charAt(numLength - 2) + "" + number.charAt(numLength - 1);
		int lastTwoDigitsNum = Integer.parseInt(lastTwoDigitsNumber);
		return lastTwoDigitsNum % 2 == 0;
	}

	static boolean isDivisibleByThree(String number) {
		// A number is divisible by three, if the sum of all its digits is divisible by
		// three.
		int numLength = number.length();
		int sum = 0;
		for (int i = 0; i < numLength; i++) {
			sum += Integer.parseInt("" + number.charAt(i));
		}
		return sum % 3 == 0;
	}

	public static void main(String[] args) {
		// 2112. yes
		// 1124. no
		// 363588395960667043875487. no

		String[] nums = { "2112", "1124", "363588395960667043875487", "1332"};

		for (int i = 0; i < nums.length; i++) {
			String number = nums[i];
			boolean result = isDivisibleBySix(number);
			System.out.println("Is " + number + " divisible by 6 ? Answer is: " + result);
			System.out.println("==============================");
		}
	}

}
