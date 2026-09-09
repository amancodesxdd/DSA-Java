public class nextpermutation{
    public static int[] permute(int[] nums) {
        int n = nums.length;
        int p = 0;
        for(int i = n - 2; i >= 0; i --){
            if(nums[i] < nums[i + 1]){
                p = i;
                break;
            }
        }

        for(int i = n - 1; i > p; i --){
            if(nums[i] > nums[p]){
            swap(nums, i, p);
            
        }
        reverse(nums, i + 1, n-1);
        }
        return nums;
        
    }

    public static void swap(int nums[], int first , int sec) {
        int temp = nums[first];
        nums[first] = nums[sec];
        nums[sec] = temp;
        }

    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start, end);
            start ++;
            end --;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        int[] temp = permute(nums);
        for (int i : temp) {
            System.out.print(i);
        }
    }

}