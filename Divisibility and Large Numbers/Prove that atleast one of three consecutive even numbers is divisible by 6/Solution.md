# Prove that atleast one of three consecutive even numbers is divisible by 6

Given three consecutive even numbers. Prove mathematically that atleast one of them is divisible by 6.

## Proof

* Let's consider three consecutive even numbers.
* So we have: i, i + 2, i + 4. With i being even.

* If at least one of the numbers is divible by six then the multiplication of these numbers is divisible by six.
* Let's suppose theorem is true for i and prove it is true for i + 2.

### Base case:
* i = 2.
* So {2,4,6}
* => 6 is divisible by 6.
* 2*4*6 = 3* (2*4*2)
* The multiplication of its factors is divisible by three, therefore by six.

### Induction:

* i
* So {i, i + 2, i + 4}
* P(i) = i * (i + 2) * (i + 4) = 3 * k for positive number k

 
* P(i + 2) =  (i + 2) * (i + 4) * (i + 6) = 
* P(i + 2) = i * [(i + 2) * (i + 4)] + 6 * [(i + 2) * (i + 4)]
* P(i + 2) = P(i) + 6 * [(i + 2) * (i + 4)]

* => P(i) is divisible by 3, by hypothesis
* => both the summation elements of P(I+2) are  divisible by 3, so P(i+2) is divisible by 3
* Then this expression is divisible by 3 and 2 (multiplication and summation of even numbers),
* **Therefore P(I+2) is divisible by 6.**






