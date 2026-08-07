import java.util.*;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
        
            for(int k=1; k<=2*(n-i); k++){
                System.out.print(" ");
            }
            
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        
        }
    }
}
