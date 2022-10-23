package exercise;

public class CalculateNetIncome {
    public static void main(String[] args) {
        int netIncome = calcNetIncome("25000 gross income, -200 water, electricity:-300");
        System.out.println("Net Income = " + netIncome);
    }

    public static int calcNetIncome(String input) {
        //Character.isDigit(char)
        boolean flag;
        int first;
        int last;
        int sum=0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                first = i;
                while (i < input.length()&&Character.isDigit(input.charAt(i)))
                    i++;
                last = i;


                if (first != 0 && input.charAt(first - 1) == '-')
                    sum = sum - Integer.parseInt(input.substring(first, last));
                else
                    sum = sum + Integer.parseInt(input.substring(first, last));
            }
        }
        return sum;
    }
}
