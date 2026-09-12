public class pascalstriangle{
    public static int pascal(int r, int c) {
        if(c == 1 || c == r){
            return 1;
        }
        return pascal(r - 1,c - 1) + pascal(r - 1, c);
    }
    public static void main(String[] args) {
        System.out.println(pascal(4, 2));
    }
}