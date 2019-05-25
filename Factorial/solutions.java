import java.lang.Math;

public class Factorial
{
  
  private static int factorialByRecursion(int n)
  { 
    if (n == 0) {
     return 1; 
    } else {
      return n*factorialByRecursion(n-1);
    }      
  }
    
  // If number n is large, it is better to use an iterative solution
  // because less costly.
  private static int factorialByIteration(int n)
  {
    
    int fact = 1;
    for (int i = 2; i <= n; i++ ) {
      fact *= i;
    }
    
    return fact;
  }
    
  public static void main(String[] args)
  {
    int num = 5;
    System.out.print("Factorial of "+ num + " is " + factorialByIteration(num));
  }

}
