package Sorting;

import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        for(int i=0; i<=arr.length-2;i++){
            int min = i;
            
            for(int j=i; j<=arr.length-1;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Sorted Array:");
        for (int i : arr) {
            System.out.print(i+ " ");
        }
        sc.close();
    }
}
