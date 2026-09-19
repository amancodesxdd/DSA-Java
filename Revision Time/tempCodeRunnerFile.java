import java.util.*;
public class countfreq {
    public static List<List<Integer>> count(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
                map.put(i, map.getOrDefault(i, 0)+ 1);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            ans.add(Arrays.asList(entry.getKey(), entry.getValue()));
}
return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,3,3,2};
        System.out.println(count(nums));
    }
}