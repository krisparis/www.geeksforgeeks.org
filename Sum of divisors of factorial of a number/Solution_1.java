import java.lang.Math;

public class Division
{  
    // function to calculate factorial 
    private static int fact(int n) { 
      if (n == 0) {
        return 1;
      }
      return n * fact(n-1); 
    }
  
    // function to calculate sum of divisor
    private static int div(int x) {
        int result = 0; 
      for (int i = 1; i<= x; i++) {
        if (x%i == 0) {
          result += i;
        }   
      }
        return result; 
    } 
  
    // Returns sum of divisors of n! 
    private static int sumFactDiv(int n) { 
        return div(fact(n)); 
    } 
  
    // driver program 
    public static void main(String args[]) {
      int n = 4;
      System.out.println(sumFactDiv(n));
    }

}
