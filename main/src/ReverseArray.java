 public class ReverseArray {

     /**
      @reverse- To find  the reverse order of the given array.
      @a - the array
      @i - first element of the array
      @j - the last element of the array
      @return - reversed order of the array
      **/

     public static int[] reverse(int[] arr, int i, int j) {
         if (i < j) {

             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
             reverse(arr, i + 1, j - 1);
         }
         return arr;
     }
 }

