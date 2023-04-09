import java.util.Scanner;

public class Main7 {
    /*
        @getReverse - get reversed list
        @param1 - integer array (array)
        @param2 - integer number (start) reverse start index
        @param3 - integer number (end) reverse end index
        @return - reversed array
    */
    public static void getReverse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        getReverse(arr, start+1, end-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
        }
        getReverse(array, 0, N-1);
        for (int i : array){
            System.out.print(i + " ");
        }
    }
}
