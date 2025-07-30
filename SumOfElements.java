public class SumOfElements {
    public static void main(String[] args){
        int[] nums = {2, 3, 5, 6 ,9};
        int result = calculateSum(nums);
        System.out.println("Sum of elements is " + result);
    }
    
    public static int calculateSum(int[] array){
        int runSum = 0;
        for(int i=0; i<array.length; i++){
            runSum = runSum + array[i];
        }
        return runSum;
    }
}
