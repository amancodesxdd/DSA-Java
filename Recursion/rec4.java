package Recursion;
import java.util.*;

public class rec4 {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int sum = 0;
    static void ntimes(){
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("Sum: "+ sum);
    }
    public static void main(String[] args) {
        ntimes();
    }
}
