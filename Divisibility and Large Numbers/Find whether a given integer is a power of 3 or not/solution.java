package divisibility;

/**
 * 3 is a prime number.
 * 
 * <p>
 * Below is the proof that only a power of p (prime number) can divide a greater
 * power of p.
 * </p>
 * 
 * <h2>Proof</h2>
 * <p>
 * Any prime number p can only be divided by p or 1.
 * </p>
 * 
 * <p>
 * Let x = p^n where n is an integer. x = p * ... * p (n-1 multiplication)
 * </p>
 * 
 * <p>
 * Let y be an integer not a power of p. So y = a_1 * ... * a_k. Each a_i is a
 * prime number but different of p and 1. Let's suppose that y divides x. x / y
 * = (p * ... * p) / a_1 * ... * a_k
 * </p>
 * 
 * <p>
 * Since at least one a_i doesn't divide p then y doesn't divide x.
 * </p>
 *
 * <h2>Conclusion</h2>
 * <p>
 * => So only a power of p can divide a greater of power of p.
 * </p>
 * 
 */
public class PowerOfThreeValidator {

	// JAVA integer maxmium value is 2147483647.
	/*
	 * The maximum power of 3 value that integer can hold is 1162261467 ( 3^19 ).
	 */
	private static final int MAX_INT_POWER_THREE = 1162261467;

	// Returns true if n is power of 3, else false
	static boolean check(int n) {
		return MAX_INT_POWER_THREE % n == 0;
	}

	// Driver code
	public static void main(String args[]) {
		int n = 9;
		if (check(n))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
