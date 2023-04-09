public class FindMinValue {
    /**
     @findMinimum - To find the minimum value.
     @param - integer array (arr)
     @return - the smallest array object(integer)
     **/
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


}
