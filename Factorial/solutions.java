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
  
  public static void main(String[] args)
  {
    int num = 5;
    System.out.print("Factorial of "+ num + " is " + factorialByRecursion(5));
  }

}
