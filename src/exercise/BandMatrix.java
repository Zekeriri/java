package exercise;

public class BandMatrix {
    public static void main(String[] args) {
        int n=4;
        int width=2;

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(Math.abs(i-j)<=width)
                    System.out.print("*  ");
                else
                    System.out.print("0  ");
            }
            System.out.println();
        }

    }
}
