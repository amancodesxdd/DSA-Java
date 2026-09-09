import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class leadersofarray{
    public static List<Integer> leaders(int[] nums){
       List<Integer> list1 = new ArrayList<>();
        int n = nums.length;

        int max = nums[n-1];
        list1.add(max);

        for(int i = n-2 ; i >= 0 ; i--){
            if(nums[i] > max){
                list1.add(nums[i]);
                max = nums[i];
            }
        }
        Collections.reverse(list1);
        
        return list1;
    }
    public static void main(String[] args) {
        int[] nums = {-3, 4, 5, 1, -4, -5};
        
        System.out.print(leaders(nums));
       
    }
}
