import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int digits = 0;
        int temp = num;

        while (temp!=0){
            digits ++;
            temp = temp/10;
        }
        int sum = 0;
        temp = num;
        while(temp != 0){
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit,digits);
            temp = temp/10;
        }

        if(sum == num){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}
