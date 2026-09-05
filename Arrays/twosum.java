// public class twosum {
//     public static int[] twosum(int[] nums, int target) {
//         int[] temp = new int[2];
//         for(int i = 0; i < nums.length; i++){
//             for (int j = 1; j < nums.length; j++) {
//                 if(nums[i] + nums[j] == target){
//                     temp[0] = i;
//                     temp[1] = j;
//                     return temp;
//                 }
//             }
//         }
//         return new int[0];
        
//     }
//     public static void main(String[] args) {
//         int[] nums = {1,6,2,10,3};

//         int[] arr = twosum(nums, 7);

//         System.out.println(java.util.Arrays.toString(arr));
        
//     }
// }

import java.util.HashMap;

public class twosum{
    public static int[] twosum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i ++){
            int num = nums[i];
            int rem = target - num;
            
            if(map.containsKey(rem)){
                return new int[] {map.get(rem), i};
            }
            map.put(num, i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] nums = {1,6,2,10,3};
        
        int[] arr = twosum(nums, 8);

        for (int i : arr) {
            System.out.print(i+ " ");
        }

    }
}

