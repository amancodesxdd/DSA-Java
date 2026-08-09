import java.util.*;

public class reversenum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    int newnum = 0;

    while(num>0){
        int temp = num%10;
        newnum = newnum*10+temp;
        num = num/10;
    }
    System.out.println("New Number: "+ newnum);
    }
}
