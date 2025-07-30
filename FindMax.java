public class FindMax {
    public static void main(String[] args){
        int[] nums = {2,9,4,6,8};
        int result = maxNum(nums);
        System.out.println("The maximum number here is "+ result);
    }

    public static int maxNum(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            max = Math.max(max, array[i]);
        }
        return max;
    }
    
}