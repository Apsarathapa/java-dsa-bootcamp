public class SumOfEvenNumbers {
    public static void main(String[] args){
        int[] nums = {2,5,6,8,9,10};
        int result = sumOfEvenNums(nums);
        System.out.println("The sum of even numbers is " +result);
    }

    public static int sumOfEvenNums(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                sum += arr[i];
            }else{
                System.out.println(arr[i] + " is an odd number");
            }
        }
        return sum;
    }
}
