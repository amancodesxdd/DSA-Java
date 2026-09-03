import java.util.Arrays;

public class unionoftwosortedarrays{
    public static int[] union(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0;
        int j = 0;

        int[] union = new int[n1 + n2];
        int k = 0;

        while(i < n1 && j < n2){
            if(nums1[i] <= nums2[j]){
                if( k == 0 ||union[k-1] != nums1[i] ){
                    union[k++] = nums1[i];
                }
                i++;
            }
            else{
                if(k == 0 || union[k-1] != nums2[j]){
                    union[k++] = nums2[j];
                }
                j++;
            }
        }
    while(i < n1){
        if( k == 0 || union[k-1] != nums1[i]){
                    union[k++] = nums1[i];
                }
                i++;
    }
    while (j < n2) {
        if(k == 0|| union[k-1] != nums1[j]){
                    union[k++] = nums2[j];
                }
                j++;
    }
    return Arrays.copyOf(union, k);
    }

    public static void main(String[] args) {
        int[] nums1 = {3,4,6,7,9,9};
        int[]  nums2 = {1,5,7,8,8};
        
        union(nums1, nums2);

        for (int i : union(nums1, nums2)) {
            System.out.print(i);
        }
    }
}