public class gcdrev{
    public static void main(String[] args) {
        
    }
    public static int gcd(int a, int b) {
        if(a==0){
            return b;
        }
        if(b == 0){
            return a;
        }

        if(a>b){
            return gcd(b, a%b);
        }
        else{
            return gcd(b%a, a);
        }
    }
}