import java.util.*;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int k=1; k<n-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--){
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
            for(int k=2*i-1; k>=1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}