public class kadanesalgo {
    public static int kadane(int[] nums) {
        int sum = nums[0];
        int max = nums[0];

        for(int i = 1; i < nums.length;i ++){
            if(sum > 0){
                sum = sum + nums[i];
            }else{
                sum = nums[i];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {-1,2,3,-1,2,-6,5};

        System.out.println(kadane(nums));
    }
}