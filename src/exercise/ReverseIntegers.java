package exercise;

public class ReverseIntegers {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        reverseInts(nums);
        printInts(nums);
    }

    //�����������
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

    //��ת����
    public static void reverseInts(int[] nums) {
        int temp=0;
        for (int i = 0; i < nums.length/2; i++) {
            temp=nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;
        }
    }
}
