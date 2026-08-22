package Arrays;

public class largestelement {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,1};

        int max = arr[0];

        for(int i = 0; i < arr.length-1; i ++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
