package Arrays;

public class linearsearch {
    public static int ls(int[] arr, int k){
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == k){
                return i;
                
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,1,8};

        System.out.println(ls(arr, 4));
    }
}
