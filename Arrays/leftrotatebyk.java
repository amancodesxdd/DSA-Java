package Arrays;

public class leftrotatebyk {

    public static void rotate(int[] arr) {
        int k = 2;
        for (int j = 1; j<=k; j++){

            for(int i = 0; i <=arr.length-2; i ++){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
}
    }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        rotate(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}