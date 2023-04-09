import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int req = scanner.nextInt();
        switch (req) {
            case 1:
                int n = scanner.nextInt();
                int[] arr = new int[n];
                Scanner scanner1 = new Scanner(System.in);
                for (int i = 0; i < n; i++) {
                    arr[i] = scanner.nextInt();
                }
                System.out.println(FindMinValue.findMinimum(arr));
                break;
            case 2:
                int n2 = scanner.nextInt();
                int[] arr2 = new int[n2];
                Scanner scanner2 = new Scanner(System.in);
                for (int i = 0; i < n2; i++) {
                    arr2[i] = scanner.nextInt();
                }
                System.out.println(FindAverage.calculateAverage(arr2));
                break;
            case 3:
                int n3 = scanner.nextInt();
                FindPrime.isPrime(n3);
                System.out.println(FindPrime.isPrime(n3));
                break;
            case 4:
                int n4 = scanner.nextInt();
                Factorial.factorial(n4);
                System.out.println(Factorial.factorial(n4));
                break;
            case 5:
                int n5 = scanner.nextInt();
                Fibonacci.fibonacci(n5);
                System.out.println(Fibonacci.fibonacci(n5));
                break;
            case 6:
                double a6 = scanner.nextDouble();
                int n6 = scanner.nextInt();
                Power.power(a6, n6);
                System.out.println(Power.power(a6, n6));
                break;
            case 7:
                int n7 = scanner.nextInt();
                int[] arr7 = new int[n7];
                Scanner scanner7 = new Scanner(System.in);
                for (int i = 0; i < n7; i++) {
                    arr7[i] = scanner.nextInt();
                }
                ReverseArray.reverse(arr7, 0, n7 - 1);
                for(int i : arr7)
                    System.out.print(i + " ");
                break;
            case 8:
                String s = "123456";
                boolean isDigit = CheckDigits.isAllDigits(s);
                if (isDigit){
                   System.out.println("The string consists only of digits");
                }
                else {
                    System.out.println("The string contains non-digit characters");
                }
                break;
            case 9:
                int n9 = scanner.nextInt();
                int k = scanner.nextInt();
                int numFromBinom = BinomialCoefficient.binomialCoefficient(n9, k);
                System.out.println(numFromBinom);
                break;
            case 10:
                int a10 = scanner.nextInt();
                int b10 = scanner.nextInt();
                GCD.gcd(a10,b10);
                System.out.println(GCD.gcd(a10,b10));
                break;
            case 0:
                System.exit(0);
        }
    }
}
