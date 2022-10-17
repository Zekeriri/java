package exercise;

public class CopyEvenIndices {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        int[] copyNums = copyEven(nums);
        printInts(copyNums);
    }
    //
    public static int[] copyEven(int[] nums) {
        int[] copyeven=new int[(nums.length+1)/2];
        for (int i = 0; i <copyeven.length ; i++) {
            copyeven[i]=nums[2*i];
        }
        return copyeven;
    }
    //
    public static void printInts(int[] nums){
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            if(i!= nums.length-1)
                System.out.print(nums[i]+",");
            else
                System.out.print(nums[i]);
        }
        System.out.println("]");
    }

}
