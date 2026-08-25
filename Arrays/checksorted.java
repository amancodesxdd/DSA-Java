package Arrays;

public class checksorted {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 1};
        if(isSorted(arr)){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
        
    }
    public static boolean isSorted(int[] arr) {
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
            }
        }
        return isSorted;
    }
}