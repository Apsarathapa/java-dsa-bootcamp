public class FindSecondMax {
    public static void main(String[] args){
        int[] arr = {3, 6, 17, 14, 12};
        int maxNum = findMaxNum(arr);
        int result = findSecondMaxNum(arr, maxNum);
        System.out.println("The second Max number is " + result);
    }
    //find max num
    public static int findMaxNum(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
        }
        System.out.println("The max number is "+ max);
        return max;
    }
    
    //find second max numbr
    public static int findSecondMaxNum(int[] nums, int max){
        int secMax = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < max && nums[i] > secMax){
                secMax = nums[i];
            }
        }
        System.out.println("the second max number is " + secMax);
        return secMax;
    }
}
