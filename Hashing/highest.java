public class highest{
    public static void main(String[] args) {
        int[] arr = {2,3,2,4,6,4,2};

        int hash[] = new int[10];

        for(int i = 0; i < arr.length; i++){
            hash[arr[i]]++;
        }

        int max = 0;
        int num = 0;

        for(int i = 0; i<hash.length; i ++){
            if(hash[i] > max ){
                max = hash[i];
                num = i;
            }
        }
        System.out.println("Highest occuring element: "+ num);
        System.out.println("Frequency: "+ max);
    }
     
    
}