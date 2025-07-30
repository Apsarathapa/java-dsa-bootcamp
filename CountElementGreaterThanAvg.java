public class CountElementGreaterThanAvg {
    public static void main(String[] args){
        int[] nums = {3,5,18,2};
        double avg = calculateAvg(nums); //calls the calculateAvg method
        System.out.println("The average of the array is " + avg);

        int count = CountNumGreaterThanAvg(nums,avg); //calls the countNumGreaterthanavg method
        System.out.println("The number of element greater than the average is " + count);
    }
//method to calculate the average
    public static double calculateAvg(int[] array){
        int sum = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            sum = sum + array[i];
        }
        double avg = sum / array.length;
        return avg;
    }

//method to calculate the count of numbrs greater than average
    public static int CountNumGreaterThanAvg(int[] array, double avg){
        int count =0;
        for(int i=0; i< array.length; i++){
            if(array[i] > avg){
                count++;
            }
        }
        return count;
    }

}
