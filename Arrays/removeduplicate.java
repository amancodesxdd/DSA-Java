
public class removeduplicate {
    public static int duplicate(int[] arr){
        int count = 1;
        for(int i = 0; i < arr.length-1; i ++ ){
            if(arr[i] != arr[i+1]){
              count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,3,3,5,6};

        System.out.println(duplicate(arr));
    }
}
