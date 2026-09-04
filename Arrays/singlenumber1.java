// public class singlenumber1 {
//     public static int single(int[] nums) {
//         int count = 0;
//         for(int i = 0; i < nums.length; i++){
//             for (int j = 0; j < nums.length; j++) {
//                 if(nums[i] == nums[j]){
//                     count++;
//                 }
//             }
//         if (count < 2) {
//             return nums[i];
//         }
//         count= 0;
        
//         }
//         return 0;

//     }
//     public static void main(String[] args) {
//         int[] nums = {1,2,2,4,3,1,4};

//         System.out.println(single(nums));
//     }
// }

public class singlenumber1 {
    public static int single(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            count ^= nums[i];
            }
            return count;

    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,4,3,1,4};

        System.out.println(single(nums));
    }
}