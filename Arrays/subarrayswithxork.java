import java.util.HashMap;

public class subarrayswithxork{
    public static int count(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int x = 0;
        int count = 0;

        for (int i : nums) {
            x = x ^ i;
            int target = x ^ k;

            if(map.containsKey(target)){
                count += map.get(target);
            }
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,2,6,4};

        System.out.println(count(nums, 6));
    }
}
