public class floorceil{
    public static int[] floil(int[] nums, int x) {
        int low = 0;
        int high = nums.length - 1;

        int floor = -1;
        int ceil = -1;

        while(low <= high){
            int mid = high + low/2;

            if(nums[mid] == x){
                floor = nums[mid];
                ceil = nums[mid];
                break;
            }
            else if(nums[mid] < x){
                floor = nums[mid];
                low = mid +  1;
            }
            else{
                ceil = nums[mid];
                high = mid - 1;
            }
        }
        return new int[] {floor,ceil};
    }
    public static void main(String[] args) {
        int[] nums = {3, 4, 4, 7, 8, 10};
        for (int i : floil(nums, 5)) {
            System.out.print(i + " ");
        }
    }
}