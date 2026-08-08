import java.util.*;

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int a = 0;
        for(int i=0; i<n; i++){
            for(int j=1; j<=i+1; j++){
                a++;
                System.out.print(a+ " ");
            }
            System.out.println();
        }
    }
}