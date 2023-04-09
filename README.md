 # Karsybai-Baibolat
 1. Find the minimum value
 2. Find the average value
 3. Find prime number
 4. Factorial
 5. Fibonacci 
 6. Power
 7. Reverse array
 8. Check digits
 9. Binomial coefficient
 10. Find the GCD
  
   Task 1 module src

Description: Return the minimum value of an array
 
Explanation: In the above code, we define a method called findMinimum which takes in the array as input. We initialize the minimum element to be the first element of the array and then use a for loop to iterate over the remaining elements of the array. If we find an element that is smaller than the current minimum, we update the minimum value.



Solution: 

       public static int findMinimum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null.");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

   Task 2 module src

Description: Return the average value of an array
 
Explanation: In the above code, we define a method called calculateAverage which takes in the array as input. We use a for loop to iterate over the array and calculate the sum of all elements. Finally, we divide the sum by the length of the array to get the average.

Solution:
 
     public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        return avg;
    }
    
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

Description: return power of the number

Explanation: If "n" is 0, then "a" raised to the power of 0 is 1, so we return 1.
If "n" is negative, we return the reciprocal of "a" raised to the absolute value of "n".
If "n" is positive, we use a loop to multiply "a" by itself "n" times and return the result.

Solution:
 
     public static double power(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1/power(a, -n);
        } else {
            double result = 1;
            for (int i = 0; i < n; i++) {
                result *= a;
            }
            return result;
        }
    }

   Task 7 module src

Description: return reverse order of the array

Explanation: In  the above code, we first define a recursive method called reverse which takes in the array, a start index and an end index. We swap the elements at the start and end indices and then call the reverse method again with the updated indices.

Solution:

         public static int[] reverse(int[] arr, int i, int j) {
         if (i < j) {

             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
             reverse(arr, i + 1, j - 1);
         }
         return arr;
     }

   Task 8 module src

Description: return check for is all characters are digits

Explanation: This function takes a string s as input and checks whether every character in the string is a digit using the Character.isDigit() method. If it encounters a non-digit character, it immediately returns false. If it makes it through the entire string without finding a non-digit character, it returns true
    
Solution:

        public static boolean isAllDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

   Task 9 module src

Description: return the binomial coefficient of the number

Explanation: the function will return the binomial coefficient of the number. Base cases are k=0, it will return 1, and n=k, it will return 1. Otherwise, it returns recursive function with arguments n-1 and k-1 added to recursive function with arguments n-1 and k.
  
Solution:

        public static int binomialCoefficient(int n, int k){  
        if (k == 0) {
            return 1;
        }
        if (n == k) {
            return 1;
        }
        return binomialCoefficient(n-1,k-1) + binomialCoefficient(n-1, k);
    }