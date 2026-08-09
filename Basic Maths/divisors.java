import java.util.*;
public class divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

            for(int n = 1;n<=num;n++){
                if(num%n==0){
                    list.add(n);
                }
        }System.out.println(list);
    }
}


