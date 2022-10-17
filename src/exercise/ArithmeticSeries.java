package exercise;

public class ArithmeticSeries {
    public static void main(String[] args) {

        printInts(arithSeries(5));

    }
    //
    public static int[] arithSeries(int n) {
        int[] intArr=new int[n*(n+1)/2];
        int num=0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < i+1; j++) {
                intArr[num]=j+1;
                num++;
            }
        }
        return intArr;
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
