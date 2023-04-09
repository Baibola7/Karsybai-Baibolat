public class FindAverage {

    /**
     @calculateAverage - To find the average value
     @param - integer array (arr)
     @return - the average is an array object(integer)
     **/
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        return avg;
    }
}
