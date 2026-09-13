import java.util.HashMap;

public class longestsubwithsum0{
    public static int longest(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int len = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if(sum == 0){
                len = i + 1;
            }
            else{
                if(map.containsKey(sum)){
                    len = Math.max(len, i - map.get(sum));
                }
                else{
                    map.put(sum, i);
                }
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int[] nums = {15,-2,2,-8,1,7,10,23};

        System.err.println(longest(nums));
    }
}