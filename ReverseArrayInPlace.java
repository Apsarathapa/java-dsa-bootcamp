public class ReverseArrayInPlace {
    public static void main(String[] args){
        int[] nums = {2,5,3,7};
        System.out.println("Original array: ");
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    int start = 0;
    int end = nums.length-1;
    
    while(start < end){
        //swap
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;

        start++;
        end--;
    }

    System.out.println("Reversed Array: ");
    for(int i=0; i<nums.length; i++){
        System.out.print(nums[i] + " ");
    }
        System.out.println();
    }
}
