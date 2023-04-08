import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int req = scanner.nextInt();
        switch (req){
            case 1 :
                int b = scanner.nextInt();
                int[] arr = new int[b];
                Scanner scanner1 = new Scanner(System.in);
                for (int i = 0; i < b; i++){
                    arr[i] = scanner.nextInt();
                }
                System.out.println(FindMinValue.findMinimum(arr));
                break;
            case 2:
                int b2 = scanner.nextInt();
                int[] arr2 = new int [b2];
                Scanner scanner2 = new Scanner(System.in);
                for (int i = 0; i < b2; i++) {
                    arr2[i] = scanner.nextInt();
                }
                System.out.println(FindAverage.calculateAverage(arr2));
        }
    }
}