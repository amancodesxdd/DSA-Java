public class countinversion{
    public static int merge(int[] nums,int low, int mid, int high){
        int i = low;
        int j = mid + 1;
        int count = 0;
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
                count += mid - i + 1;
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
        int[] nums = {2,3,7,1,3,5};

        System.out.println(mergesort(nums, 0, nums.length-1));
    }
}