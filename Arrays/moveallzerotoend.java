package Arrays;

public class moveallzerotoend {

    public static void rotate(int[] nums) {
       for(int i = 0;i < nums.length-1;i++ ){
            for(int k = 0;k < nums.length-1;k++ ){
                if(nums[k] ==0 ){
                int temp = nums[k];
                nums[k] = nums[k + 1];
                nums[k + 1] = temp;} 
        }
    }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,3,0,5,6};

        rotate(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}