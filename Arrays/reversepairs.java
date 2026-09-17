public class reversepairs{
    public static int merge(int[] nums, int low, int mid,int  high) {
        int count = 0;
        int j = mid + 1;
        for (int i = low; i <= mid; i++) {
            while(j <= high && nums[i] > 2L*nums[j]){
                j++;
            }
            count += j - (mid + 1);
        }
        
        int i = low;
        j = mid + 1;
        int k = 0;
        int[] temp = new int[high - low + 1];
        
        while(i <= mid && j <= high){
            if(nums[i] <= nums[j]){
                temp[k] = nums[i];
                i++;
            }
            else{
                temp[k] = nums[j];
                j ++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = nums[i];
            i ++;
            k++;
        }
        while(j <= high){
            temp[k] = nums[j];
            j ++;
            k++;
        }
        for (int x = 0; x < temp.length; x++) {
            nums[low + x] = temp[x];
        }
        return count;
    }
        public static int mergesort(int[] nums, int low, int high) {
        
        if(low>=high){
            return 0;
        }
        int mid = (low + high) / 2;

        int count = 0;

        count += mergesort(nums, low, mid);
        count += mergesort(nums, mid+1, high);

        count += merge(nums, low, mid, high);

        return count;
    }
    public static void main(String[] args) {
        int[] nums = {6,4,2,1,7};
        System.out.println(mergesort(nums, 0, nums.length-1));
    }
}