package Sorting;

public class recursiveinsertionsort {
    public static void is(int[] arr, int n) {
        if(n<=1){
            return;
        }
        is(arr,n-1);

        int j = n - 1;

        while(j>0 && arr[j] < arr[j-1]){
            int temp = arr[j];
            arr[j] = arr[j-1];{
            arr[j-1] = temp; 

            j--;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {5,3,1,2,4};

        is(arr,arr.length);

        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
}
