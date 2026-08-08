import java.util.*;

public class pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            char c = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j=1; j<=2*i+1; j++){
                System.out.print(c);
                if(j <= breakpoint){
                    c ++;
                }else{
                    c--;
                }
            }

            System.out.println();
        }
    }
}