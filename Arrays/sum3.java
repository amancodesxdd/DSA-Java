import java.util.*;

public class sum3{
    public static List<List<Integer>> sum(int nums[]){
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            if(i>0 && nums[i] == nums[i - 1]){
                continue;
            }

            int left = i + 1, right = n - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left ++;
                    right --;
                
                while(left < right && nums[left] == nums[left - 1 ]){
                    left ++;
                }
                while(left < right && nums[right] == nums[right + 1]){
                    right--;
                }
                }

                else if(sum < 0){
                    left ++;
                }
                else{
                    right --;
                }
               
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {2, -2, 0, 3, -3, 5};
        System.out.print(sum(nums));
    }
}