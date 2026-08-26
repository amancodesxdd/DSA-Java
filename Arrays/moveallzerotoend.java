package Arrays;

public class moveallzerotoend {

    public static void rotate(int[] arr) {
        for(int i = 0;i < arr.length;i++ ){
          if(arr[i] ==0 ){
            for(int k = i;k < arr.length-1;k++ ){
                int temp = arr[k];
                arr[k] = arr[k + 1];
                arr[k + 1] = temp; 
        }
    }
}
}
    public static void main(String[] args) {
        int[] arr = {1,0,3,0,5,6};

        rotate(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}