package Sorting;

public class quicksort {
    public static void qs(int[] arr, int low, int high) {
        if(low<high){
            int pindex = f(arr, low, high);
            qs(arr, low, pindex-1);
            qs(arr,pindex+1,high);
        }
    }
    public static int f(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            while (j >= low && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        arr[low] = arr[j];
        arr[j] = pivot;
        return j;
    }
    public static void main(String[] args) {
        int[] arr = {5,2,6,7,1,4,8,3};

        qs(arr,0,arr.length - 1);

        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }


}
