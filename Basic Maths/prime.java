import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num<=1){
            System.out.println("Not Prime");
            return;
        }

        boolean isprime = true;
        for (int i = 2; i * i <= num; i++){
            if(num%i==0){
                isprime = false;
                break;
            }
        }

        if(isprime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }



    }
}




















//         if(num<=1){
//             System.out.println("False");
//         }

//         int count=0;
        
//         for(int n = 2;n<=num;n++){
//                 if(num%n==0){
//                     count++;
//                 }
//         }
//         if (count>2){
//             System.out.println("False");
//         }else{
//             System.out.println("True");
//         }
//     }
// }