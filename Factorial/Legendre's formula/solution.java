import java.lang.Math;

public class LargestPower
{
  
  /* 
  * n! =  p* ... * kp * p^2 * ... * k'* p^2 * ... * k'''* p^m * [other numbers that might not be multiple of p]  
  *
  * We want to find the largest x such as p^x divides n, p and n are given.
  *
  * floor(n/p): number of multiples of p that are factors of n! [including all the p^2, p^3, ...]
  *  > All these numbers are multiplicated with each other
  *  > So the result of multiplication of these floor(n/p) factors gives a number such as p^x where x >= floor(n/p) 
  *  
  *  floor(n/p^2): number of multiples of p^2  that are factors of n!
  *  > floor(n/p) already count the p factors for all the multiple of p^2 factors of n!
  *  > So floor(n/p) + floor(n/p^2) count all the p factors in n! and add all the p^2 factors in n!
  *
  *  so if we continue  floor(n/p) + floor(n/p^2) + ... + floor(n/p^m) = x, in p^x
  *
  */
  
  
  private static int largestPowerForFactor (int n, int p) {
    
    int result = 0;
    while (n > 0) {
      n /= p;
      result += n;
    }
    return result;    
  }  
    
  public static void main(String[] args)
  {
    int n = 10; 
    int p = 3; 
    System.out.print(" The largest power of " + p + " that divides "
                + n + "! is " + largestPowerForFactor(n, p));
  }

}
