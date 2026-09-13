import java.util.*;

public class sum4{
    public static List<List<Integer>> sum(int nums[], int target){
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            if(i>0 && nums[i] == nums[i - 1]){
                continue;
            }
        for (int j = 1; j < n; j++) {
            if(j>0 && nums[j] == nums[j - 1]){
                continue;
            }

            int left = j + 1, right = n - 1;

            while(left < right){
                int sum = nums[i] + nums[j] + nums[left] + nums[right];

                if(sum == target){
                    list.add(Arrays.asList(nums[i],nums[j], nums[left], nums[right]));
                    left ++;
                    right --;
                
                while(left < right && nums[left] == nums[left - 1 ]){
                    left ++;
                }
                while(left < right && nums[right] == nums[right + 1]){
                    right--;
                }
                }

                else if(sum < target){
                    left ++;
                }
                else{
                    right --;
                }
               
            }
            
        }
    }
        return list;
}

    public static void main(String[] args) {
        int[] nums = {1, -2, 3, 5, 7, 9};
        System.out.print(sum(nums,7));
    }
}
