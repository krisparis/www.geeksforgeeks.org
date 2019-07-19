/**
 * Since input number may be very large, we cannot use n % 4 to check if a
 * number is divisible by 4 or not, especially in languages like C/C++/Java. 
 * The idea is based on following fact :
 * 
 * ========================================================================
 * A number is divisible by 4 if number formed by last two digits of it is
 * divisible by 4.
 * ========================================================================
 * 
 * Proof:
 * Let us consider 76952, we can write it as
 * 76942 = 7*10000 + 6*1000 + 9*100 + 5*10 + 2
 * 
 * The proof is based on below observation:
 * Remainder of 10i divided by 4 is 0 if i greater 
 * than or equal to two. Note than 100, 1000,... etc
 * lead to remainder 0 when divided by 4.
 * 
 * 
 * So remainder of "7*10000 + 6*1000 + 9*100 + 5*10 + 2" divided by 4 is
 * equivalent to remainder of following : 
 * 0 + 0 + 0 + 5*10 + 2 = 52
 * 
 * Therefore we can say that the whole number is 
 * divisible by 4 if 52 is divisible by 4.
 * 
 */ 


/ Java program to find if a number is 
// divisible by 4 or not 
class Solution 
{ 
    // Function to find that number  
    // is divisible by 4 or not 
    static boolean check(String str) 
    { 
        int n = str.length(); 
       
        // Empty string 
        if (n == 0) {
          return false;
        }       
        // If there is single digit 
        if (n == 1) {
          return ((str.charAt(0)-'0')%4 == 0); 
        }
           
        // If number formed by last two digits is 
        // divisble by 4. 
        int last = str.charAt(n-1) - '0'; 
        int second_last = str.charAt(n-2) - '0'; 
        return ((second_last*10 + last) % 4 == 0); 
    } 
  
    // main function 
    public static void main (String[] args)  
    { 
        String str = "76952"; 
        if(check(str)) {
          System.out.println("Yes"); 
        }            
        else {
          System.out.println("No");
        } 
    } 
}  
