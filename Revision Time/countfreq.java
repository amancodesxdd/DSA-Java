import java.util.*;
class Solution {
    public HashMap<Integer,Integer> countFrequencies(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
                map.put(i, map.getOrDefault(i, 0)+ 1);
        }
        return map;
    }
}