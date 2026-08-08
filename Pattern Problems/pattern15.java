import java.util.*;

public class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i=n; i>=1; i--){
            for(char c='A'; c<'A'+i; c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}