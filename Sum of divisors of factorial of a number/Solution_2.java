// Java program to find sum of divisors in n! 
import java.util.*; 

public class Division { 

// allPrimes[] stores all prime numbers less 
// than or equal to n. 
static ArrayList<Integer> allPrimes=new ArrayList<Integer>(); 

// Fills above vector allPrimes[] for a given n 
static void sieve(int n) { 
  // Create a boolean array "prime[0..n]" and 
  // initialize all its entries as true. A value 
  // in prime[i] will finally be false if i is 
  // not a prime, else true. 
  boolean[] prime=new boolean[n+1];

	// Loop to update prime[]
	for (int p = 2; p*p <= n; p++) { 
		// If prime[p] is not changed, then it 
		// is a prime 
		if (prime[p] == false) 
		{ 
			// Update all multiples of p 
			for (int i = p*2; i <= n; i += p) 
				prime[i] = true; 
		} 
	} 

	// Store primes in the vector allPrimes 
	for (int p = 2; p <= n; p++) 
		if (prime[p]==false) 
			allPrimes.add(p); 
} 

// Function to find all result of factorial number 
static int factorialDivisors(int n) { 
	sieve(n); // create sieve 

	// Initialize result 
	int result = 1; 

	// find exponents of all primes which divides n 
	// and less than n 
	for (int i = 0; i < allPrimes.size(); i++) { 
		// Current divisor 
		int p = allPrimes.get(i);

		// Find the highest power (stored in exp)' 
		// of allPrimes[i] that divides n using 
		// Legendre's formula. 
		int exp = 0;
        int factorsMultiplication = p;
		while (factorsMultiplication <= n) { 
			exp = exp + (n/factorsMultiplication); 
			factorsMultiplication *= p; 
		} 

		// Using the divisor function to calculate 
		// the sum 
		result = result*((int)Math.pow(p, exp+1)-1)/ (p-1); 
	}

	// return total divisors 
	return result; 
} 

// Driver program to run the cases 
public static void main(String[] args) 
{ 
	System.out.println(factorialDivisors(4)); 
} 
} 
