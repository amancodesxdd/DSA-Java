import java.util.*;

public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(char c=(char)('A'+i); c<=(char)('A'); c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}