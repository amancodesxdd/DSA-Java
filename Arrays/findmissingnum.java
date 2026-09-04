public class findmissingnum{
    public static int missing(int[] nums) {
        int n = nums.length;
        int sum1 = n*(n+1)/2;

        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum2 = sum2 + nums[i];
        }

        int diff = sum1 - sum2;
        return diff;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,6};
        System.out.println(missing(nums));
    }
}