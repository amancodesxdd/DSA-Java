import java.util.List;
import java.util.ArrayList;
public class majorityelement2{
    public static List<Integer> majority(int[] nums){
        List<Integer> list = new ArrayList<> ();

        int c1 = 0; int c2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(c1 == 0 && el2 != nums[i]){
                c1 = 1;
                el1 = nums[i];
            }
            if(c2 == 0 && el1 != nums[i]){
                c2 = 1;
                el2 = nums[i];
            }
            else if(nums[i] == el1){
                c1 ++;
            }
            else if(nums[i] == el2){
                c2 ++;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(el1 == nums[i]){
                c1 ++;
            }
            if(el2 == nums[i]){
                c2 ++;
            }
        }
        int mini = nums.length/3;
        if(c1 > mini){
            list.add(el1);
        }
        if(c2 > mini){
            list.add(el2);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,1,3,2,2};

        
        System.out.println(majority(nums));
    }
    
}