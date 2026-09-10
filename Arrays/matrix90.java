public class matrix90{
    public static  int[][] ninety(int[][] nums){
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = nums[i][j];
                 nums[i][j] = nums[j][i];
                 nums[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while(left < right){
                int temp = nums[i][left];
                 nums[i][left] = nums[i][right];
                 nums[i][right] = temp;

                left++;
                right--;
            }
        }
        return nums;
    }
    
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        ninety(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
    }
}
}