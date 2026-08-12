package Recursion;
public class rec6 {
    static void reverse(int a[], int start, int end){
        if(start>=end){
            return;
        }


        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;


        reverse(a, start +1 , end -1);
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

        reverse(a, 0, 4);

        for(int x : a){
            System.out.print(x+" ");
        }
        
    }
}
