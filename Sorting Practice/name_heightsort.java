public class name_heightsort {
    public static void main(String[] args) {
        String[] name = {"X","Y","A","R","C"};
        int[] height = {3,5,1,6,2};


        for(int i=0; i<=height.length-2;i++){
            int max = i;

            for(int j = i+1; j<=height.length-1;j++){
                if(height[j]>height[max]){
                    max=j;
                }
            }
            int temp = height[max];
            height[max] = height[i];
            height[i] = temp;

            String temp2 = name[max];
            name[max] = name[i];
            name[i] = temp2;
        }
        System.out.print("Sorted Names: ");

        for (String i : name) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Sorted Heights: ");

        for (int i : height) {
            System.out.print(i + " ");
        }
    }
}
