public class sort0s1s2s {
    public static void sort(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length -1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums,mid, low);
                low ++;
                mid ++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else if (nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,2,1,0};

        sort(nums);

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}


