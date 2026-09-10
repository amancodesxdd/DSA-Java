public class matrixzero{
    public static int[][] matrix(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        int col0 = 1;

        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                if(nums[i][j] == 0){
                    nums[i][0] = 0;
                
                if(j!=0){
                    nums[0][j] = 0;
                }
                else{
                    col0 = 0;
                }    
            }            
            }
        }

        for(int i = 1; i < n; i++ ){
            for (int j = 1; j < m; j++) {
                if(nums[i][0]==0 || nums[0][j] == 0){
                    nums[i][j] = 0;
                }
            }
        }
        if(nums[0][0] == 0){
            for(int i = 0; i < n; i++){
                nums[i][0] = 0;
            }   
        }
        if(col0 == 0){
            for (int j = 0; j < m; j++) {
                nums[0][j] = 0;
            }
        }
        return nums;
        
    }

    public static void main(String[] args) {
        int[][] nums =  {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        matrix(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }

    }
}