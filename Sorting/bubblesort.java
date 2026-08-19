package Sorting;

import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        for(int i = arr.length-1; i >= 1; i--){
            for(int j = 0; j <= i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted Array:");
        for (int i : arr) {
            System.out.print(i+ " ");
        }
        sc.close();
    }
}
