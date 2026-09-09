import java.util.HashSet;
import java.util.Set;
public class longeststreak{
    public static int longest(int[] nums){
        if(nums ==null || nums.length == 0){
            return  0;
        }
    Set<Integer> set = new HashSet<>();

    for (int num : nums) {
        set.add(num);
    }

    int longeststreak = 0;

    for(int num: set){
        if(!set.contains(num - 1)){
            int currentnum = num;
            int currentstreak = 1;

            while(set.contains(currentnum + 1)){
                currentnum += 1;
                currentstreak += 1;
            }
            longeststreak = Math.max(longeststreak, currentstreak);
        }
    }
    
    return longeststreak;
    }
}