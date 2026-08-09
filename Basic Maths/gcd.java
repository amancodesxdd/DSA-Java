import java.util.*;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter a number 2: ");
        int n2 = sc.nextInt();

        while(n1>0&&n2>0){
            if(n1>n2){
                n1 = n1%n2;
            }else{
                n2 = n2%n1;
            }
            }
        if(n1==0){
            System.out.println("GCD: "+ n2);
        }else{
            System.out.println("GCD: "+ n1);
        }
        
}
}
