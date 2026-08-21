package Sorting;
public class mergesort {

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[arr.length];
        int left = low;
        int right = mid +1;
        int k = 0;

        while(left<=mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[k] = arr[left];
                left ++;
            }
            else{
                temp[k] = arr[right];
                right ++;
            }
            k++;
        }

        while(left<=mid){
            temp[k] = arr[left];
            left++;
            k++;
        }
        while(right<=high){
            temp[k] = arr[right];
            right++;
            k++;
        }

        for(int i = 0; i < k; i++){
        arr[low+ i] = temp[i];
    }
        
    }
    
    public static void ms(int[] arr, int low,int high){
        if(low>=high){
            return;
        }
        int mid = (low + high)/2;

        ms(arr, low, mid);
        ms(arr, mid+1, high);
        merge(arr, low, mid, high);

    }

    public static void main(String[] args) {
        int[] arr = {5,2,4,1,3};

        ms(arr,0,arr.length-1);

        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
}