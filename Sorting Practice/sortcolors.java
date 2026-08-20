public class sortcolors {
    public static void sort(int[] nums) {
        
        for(int i = 0; i <= nums.length-2;i ++){
            int min = i;
            for(int j = i; j <= nums.length-1;j ++){
                if(nums[j]<nums[min]){
                  min = j;  
                }
                
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }
}
