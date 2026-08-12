package Recursion;
import java.util.*;
public class rec7 {
    static Scanner sc = new Scanner(System.in);
    static String str = sc.nextLine();

    static boolean palindrome(String str, int start, int end){
        if(start >= end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }

        return palindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        
        if(palindrome(str, 0, str.length() - 1)){
            System.out.println("Palindrome!");
        }else{
            System.out.println("Not Palindrome!");
        }

        
    }
}
