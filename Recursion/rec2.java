public class rec2 {
    public static void ntimes(int n){
        if(n == 0){
            return;
        }

        ntimes(n-1);
    System.out.println(n);   
 }
    public static void main(String[] args) {
        ntimes(10);
    }
}