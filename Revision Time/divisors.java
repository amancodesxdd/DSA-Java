import java.util.*; 
public class divisors { 
    public static  List<Integer> divisors(int n) { 
        List<Integer> list = new ArrayList<>(); 
        for(int i = 1; i < n; i ++)
            { if(n % i == 0){ list.add(i); } 
    } return list;
 }
public static void main(String[] args) {
    System.out.print(divisors(8));
} }