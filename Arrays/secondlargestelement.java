package Arrays;

public class secondlargestelement {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,1};

        int max = arr[0];
        int smax = arr[0];

        for(int i = 0; i < arr.length-1; i ++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }
        }
        System.out.println(smax);
    }
}