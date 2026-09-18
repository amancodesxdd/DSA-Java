public class rec2 {
    public static void ntimes(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        ntimes(n-1);
       
 }
    public static void main(String[] args) {
        ntimes(10);
    }
}

