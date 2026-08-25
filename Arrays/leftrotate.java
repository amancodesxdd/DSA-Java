package Arrays;

public class leftrotate {

    public static void rotate(int[] arr) {
        for(int i = 0; i < arr.length -1; i ++){
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        rotate(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}