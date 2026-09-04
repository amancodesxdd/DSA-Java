import java.util.HashMap;

public class longestsubarray {
    public static int longest(int[] nums, int k){
        HashMap <Long ,Integer> map = new HashMap<>();

        long sum = 0;
        int maxlen = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            if(sum == k){
                maxlen = i + 1;
            }

            long needed = sum - k;
            if(map.containsKey(needed)){
                int len = i - map.get(needed);
                maxlen = Math.max(maxlen, len);
            }
            
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int[] nums = {10,5,2,7,1,9};

        System.out.println(longest(nums, 15));
    }
}
