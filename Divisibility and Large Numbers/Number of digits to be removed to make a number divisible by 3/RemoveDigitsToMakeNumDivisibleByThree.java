package divisibility.bythree;

/**
 * Let S be the sum of the digits d_i of a number N. Three cases:
 * <p>
 * <ol>
 * <li>S % 3 = 0. Then there is no digits to remove.</li>
 * <li>S % 3 != 0 BUT there is one digit d_i such as (S - d_i) % 3 = 0. Then d_i
 * is the digit to remove.</li>
 * <li>S % 3 != 0 AND there is no digit d_i such as (S - d_i) % 3 = 0.</li>
 * </ol>
 * </p>
 * 
 * <p>
 * <h1>Solutions for the last case.</h1>
 * 
 * <p>
 * S % 3 = 1 OR S % 3 = 2, since the result of x % 3 is 0,1 or 2 where x is a
 * positive integer.
 * </p>
 * 
 * <h2>Case S % 3 = 1</h2>
 * <p>
 * <ul>
 * <li>There can't be any d_i such as d_i % 3 = 1 otherwise we would have (sum -
 * d_i) % 3 = 0.</li>
 * <li>There is at least one d_i such as d_i % 3 != 0 otherwise we would have S
 * % 3 = 0.</li>
 * <li>Therefore there is at least one d_i such as d_i % 3 = 2. But there can't
 * be one like this otherwise we would have S % 3 = 2, which is not true.</li>
 * <li>So there is at least two digits d_i and d_j such as d_i % 3 = 2 and d_j %
 * 3 = 2. Now we have (2 + 2) % 3 = 4 % 3 = 1. Therefore (S - d_i -d_j) % 3 = (1
 * - 1) % 3 = 0. d_i and d_j are the digits to remove.</li>
 * </ul>
 * </p>
 * 
 * <h2>Case S % 3 = 2</h2>
 * <p>Proof is similar. But we have two digits d_i and d_j such as d_i % 3 = 1 and d_j %
 * 3 = 1. Now we have (1 + 1) % 3 = 2 % 3 = 2. Therefore (S - d_i -d_j) % 3 = (2
 * - 2) % 3 = 0. d_i and d_j are the digits to remove.</p>
 * </p>
 *
 */
public class RemoveDigitsToMakeNumDivisibleByThree {

}
