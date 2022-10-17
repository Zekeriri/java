package exercise;

public class EvenOddSwap {
    public static void main(String[] args) {
        int[] nums={};
        printInts(evenOddSwap(nums));
    }
    //
    public static int[] evenOddSwap(int[] nums) {
        int[] flag=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0)
                flag[i]=-1;
            else
                flag[i]=1;
            }

        int temp=0;
        for (int i = 0; i < nums.length; i++) {
            if (flag[i]!=0)
            {
                for (int j = i+1; j <nums.length ; j++) {
                    if(flag[i]+flag[j]==0){
                        temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                        flag[i]=0;
                        flag[j]=0;
                        break;
                    }
                }
            }
        }
        return nums;
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
