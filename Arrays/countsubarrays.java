import java.util.HashMap;

public class countsubarrays{
    public static int count(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefix = 0;
        int count = 0;
        map.put(0,1);

        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            int remove = prefix - k;

            if (map.containsKey(remove)) {
                count += map.get(remove);
            }
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        System.out.println(count(nums,3));
    }
}