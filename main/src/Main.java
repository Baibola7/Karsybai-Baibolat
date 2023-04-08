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
                for (int i =0;i < b;i++){
                    arr[i] = scanner.nextInt();
                }

                System.out.println(FindMinValue.findMinimum(arr));
        }

    }
}