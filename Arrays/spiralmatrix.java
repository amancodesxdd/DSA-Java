import java.util.List;
import java.util.ArrayList;

public class spiralmatrix{
    public static List<Integer> spiral(int[][] nums){
        List<Integer> list = new ArrayList<>();
        int top = 0;
        int bottom = nums.length - 1;
        int left = 0;
        int right = nums[0].length - 1;
        if (nums == null || nums.length == 0 || nums[0].length == 0) {
            return list;
        }

        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                list.add(nums[top][i]);
            }
            top ++;
            
            for (int i = top; i <= bottom; i++) {
                list.add(nums[i][right]);
            }
            right --;

            if(top <=bottom){
                for (int i = right; i >= left; i--) {
                list.add(nums[bottom][i]);
            }
            bottom --;
            }
            if(left<=right){
                for (int i = bottom; i >= top; i--) {
                list.add(nums[i][left]);
            }
            left++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiral(nums)); 

        
    }
}
