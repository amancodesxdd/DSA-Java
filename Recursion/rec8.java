package Recursion;

import java.util.Scanner;

public class rec8 {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();

    static int fib(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        return fib(n-1)+ fib(n-2);
    }
    public static void main(String[] args) {
        for(int i = 0; i < n; i++){
            System.out.print(fib(i)+ " ");   
        }
        
    }
}
