public class missingrepeated{
    public static int[] missrepeat(int[] nums){
            int n = nums.length;

            long expectedsum = (long)n * (n + 1) / 2;

            long actual = 0;
            
            long expectedsqsum = (long)n * (n+1) * (2 * n + 1) /6;
            long actualsqsum =0;

            for(int x : nums){
                actual += x;
                actualsqsum += (long)x * x;
            }

            long diff = actual - expectedsum;

            long sqdiff = actualsqsum - expectedsqsum;

            long sum = sqdiff / diff;

            int repeating = (int) ((diff + sum) / 2);
            int missing = (int) ((sum - diff) / 2);

            return new int[]{repeating, missing};
    } 
    public static void main(String[] args) {
        int[] nums = {3,5,4,1,1};

        for (int i : missrepeat(nums)) {
            System.out.print(i + " ");
        }
    }
}