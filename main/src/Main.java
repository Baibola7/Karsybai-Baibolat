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
        }
    }
}