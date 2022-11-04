package exercise;

public class ClosestNumber
{
    public static void main(String[] args)
    {
        int[] arr = {15, -2, 11, -1};
        System.out.println(closestNum(arr));
    }

    public static int closestNum(int[] arr)
    {
        int min = 100000;
        int i = 0;
        for (int j = 0; j < arr.length; j++)
        {
            if (min >= Math.abs(arr[j] - 5))
            {
                if (min == Math.abs(arr[j] - 5))
                {
                    if (i!=0 &&(arr[i] < arr[j]))
                    {
                        i = j;
                        break;
                    } else break;

                }
                min = Math.abs(arr[j] - 5);
                i = j;
            }
        }
        return arr[i];
    }
}
