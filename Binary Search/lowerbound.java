public class lowerbound{
    public static int lowerb(int[] nums, int low, int high, int target) {
        int mid = (low + high)/ 2;
        if(low > high){
            return low;
        }
        if (nums[mid] >= target) {
            return lowerb(nums, low, mid - 1, target);
        }
        else{
            return lowerb(nums, mid + 1, high, target);
        }
    }
    public static void main(String[] args) {
        int[] nums = {3,5,8,15,19};
        System.out.println(lowerb(nums, 0, nums.length, 4));
    }
}