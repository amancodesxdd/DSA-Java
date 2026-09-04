
public class rightrotate2 {
    public static void reverse(int[] nums, int start, int end) {
        while (start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void reverse2(int[] nums, int n, int k) {
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        reverse2(nums, nums.length, 3);

        for (int i : nums) {
            System.out.print(i);
        }
    }
}
