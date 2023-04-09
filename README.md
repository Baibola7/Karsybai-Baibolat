# Karsybai-Baibolat
 1. Find the minimum value
 2. Find the average value
 3. Find prime number
 4. Factorial
 5. Fibonacci 
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

  Task 4 module src

Description: return factorial value of the number

Explanation: If "n" is not equal to 0, we return "n" multiplied by the factorial of "n-1".
This recursive call continues until we reach the base case of "n=0", at which point the recursion stops and the factorial of the original number is returned.

Solution:
        
       public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
  
  Task 5 module src

Description: return fibonacci elements of the number

Explanation: If "n" is not equal to 0 or 1, we return the sum of the previous two elements in the sequence, which are found by recursively calling the Fibonacci function with "n-1" and "n-2" as arguments.

Solution:

     public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
 
   Task 6 module src

