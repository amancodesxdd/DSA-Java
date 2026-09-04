public class consecutive1s {
    public static int max(int[] nums) {
        int count = 0;
        int max = 0;
        for(int num : nums){
            if(num == 1){
                count++;
                max = Math.max(count, max);
            }
           else{
            count = 0;
           }
        }  
        return max;          
    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,0,1,1,1,0};

        System.out.println(max(nums));
    }
}