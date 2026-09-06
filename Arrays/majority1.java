public class majority1 {
    public static int majority(int[] nums)  {
        int num = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i ++) {
            if (count == 0) {
                num = nums[i];
            }
            
            if (nums[i] == num) {
                count++;
            } else {
                count--;
            }
        }

        return num;
    }

    public static void main(String[] args) {
        int[] nums = {7,7,1,1,7,7,5,4};

        System.out.println(majority(nums));
    }
}
