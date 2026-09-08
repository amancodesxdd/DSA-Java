public class buyandsellstock{
    public static int best(int[] nums) {
        int buy = 0; int sell = 1; int profit = 0;

        while(buy < nums.length - 1){
            if(nums[sell] - nums[buy] > profit){
                profit = nums[sell] - nums[buy];
            }
            sell ++;
            
            if(sell == nums.length){
            buy ++;
            sell = buy + 1;
        }   
    }
    return profit;
    
}
    public static void main(String[] args) {
        int[] nums = {10,7,5,8,11,9};
        System.out.println(best(nums));
    }
}