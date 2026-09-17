public class maxprosubarr{
    public static int product(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];

        for(int i = 1; i < nums.length; i ++){
            int current = nums[i];

            if(current < 0){
                int temp = max;
                max = min;
                min = temp; 
            }

            max = Math.max(current, max*current);
            min = Math.min(current, min*current);

            ans = Math.max(ans, max);

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,-2,3,4,-4,-3};
        System.out.println(product(nums));
    }
}