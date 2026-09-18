public class searchx{
    public static int search(int[] nums, int low, int high, int target) {
        int mid = (low + high) / 2;

        if(low > high){
            return -1;
        }
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] > target){
            return search(nums, mid + 1, high, target);
        }
        else{
            return search(nums, low, mid - 1, target);
        }
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(search(nums, 0, nums.length - 1, 3));
    }
}