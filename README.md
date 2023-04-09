# Karsybai-Baibolat
1. Find the minimum value
2. Find the average value
3. Check for prime number
4. Factorial
5. Fibonacci value
6. a in n degree
7. Reverse the order
8. Is all digits check
9. Binomial coefficient
10. Find the GCD
  
Task 3 module src
Description: return boolean value by checking is the number is prime or not

Explanation: First, we check if the given number "n" is less than or equal to 1.
Then, we loop through all the numbers from 2 to the square root of "n".
If we have checked all the numbers up to the square root of "n" and none of them divide "n", then "n" must be a prime number and we return true.

Solution:

public static boolean isPrime(int n) {
  if (n <= 1) {
    return false;
 }
  for (int i = 2; i <= Math.sqrt(n); i++) {
   if (n % i == 0) {
    return false;
 }
 }
    return true;
 }
 }