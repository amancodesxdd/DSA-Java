package Recursion;
import java.util.*;

public class rec3 {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static void ntimes(){
        for(int i = n; i >= 1; i--){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ntimes();
    }
}

