package exercise;

public class diamondForever {
    public static void main(String[] args) {
    diamond(9);
    }
    public static void diamond(int n) {
        int asterNum;
        int dotNum;
        //上半部分
        for (int i = 0; i <n/2+1 ; i++) {
            asterNum=i*2+1;
            dotNum=n/2-i;
            for (int j = 0; j <dotNum ; j++) {
                System.out.print(". ");
            }
            for (int j = dotNum; j < dotNum+asterNum; j++) {
                System.out.print("* ");
            }
            for (int j = dotNum+asterNum; j < n; j++) {
                System.out.print(". ");
            }
            System.out.println();
        }
        //下半部分
        for (int i = n/2+1; i <n ; i++) {
            asterNum=(n-i)*2-1;
            dotNum=i-(n/2);
            for (int j = 0; j <dotNum ; j++) {
                System.out.print(". ");
            }
            for (int j = dotNum; j < dotNum+asterNum; j++) {
                System.out.print("* ");
            }
            for (int j = dotNum+asterNum; j < n; j++) {
                System.out.print(". ");
            }
            System.out.println();
        }
    }
}
