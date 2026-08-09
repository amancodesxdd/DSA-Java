import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int n = num;
        
        int newnum = 0;

    while(num!=0){
        int temp = num%10;
        newnum = newnum*10+temp;
        num = num/10;
    }

    if(n == newnum){
        System.out.println("True");
    }else{
        System.out.println("False");
    }

        

    }
}
