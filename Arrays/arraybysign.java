public class arraybysign {
    public static int[] arrange(int[] nums) {
        int[] temp = new int[nums.length];
        int p = 0; int n = 1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                temp[p] = nums[i];
                p = p + 2;
            }
            else{
                temp[n] = nums[i];
                n = n + 2;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] nums = {1,-1,-3,-4,2,3};
        int[] temp = arrange(nums);

        for (int i : temp) {
            System.out.print(i + " ");
        }
    }
}
