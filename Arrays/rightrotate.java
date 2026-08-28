package Arrays;

public class rightrotate {
    public static void rotate(int[] nums,int k) {
        k = k % nums.length;
        int[] temp = new int[k];

        for(int i = 0; i < k; i ++){
            temp[i] = nums[nums.length - k+ i];
        }

        for(int j = nums.length-1; j >= k; j-- ){
            nums[j] = nums[j - k];
        }

        for(int l =0; l < k;l ++ ){
            nums[l] = temp[l];
        }

    }
     public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        rotate(arr,3);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
