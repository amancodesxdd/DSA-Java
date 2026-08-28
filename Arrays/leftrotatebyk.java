package Arrays;

public class leftrotatebyk {

    public static void rotate(int[] arr,int k) {
        k = k % arr.length;
        int[] temp = new int[k];

        for(int i = 0; i < k; i++){
            temp[i] = arr[i];
        }
        for(int j=k; j <arr.length; j++){
            arr[j-k] = arr[j];
        }
        for(int a = arr.length-k;a <arr.length; a++){
            arr[a] = temp[a-(arr.length-k)];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        rotate(arr,3);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}