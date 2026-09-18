public class reverserev{ 
    public static  int[] reverse(int[] nums, int n) { 
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return nums;
 }
public static void main(String[] args) {
    int[] nums = {1,2,3,4,5};
    for(int i: reverse(nums, nums.length)){
        System.out.print(i + " ");
    }
} }