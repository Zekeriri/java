package exercise;

public class LLYCode {
    public static void main(String[] args) {
        int netIncome = calcNetIncome("25000 gross income, -200 water, electricity:-300");
        System.out.println("Net Income = " + netIncome);
    }

    public static int calcNetIncome(String input) {
        int m = 0, n = 0;

        for (int i = 0; i < input.length(); i++) {//遍历字符串
            if (Character.isDigit(input.charAt(i))) {//判断是否为数字
                m++;//数字的长度
                if (input.length()==m) {
                    n = n + Integer.parseInt(input.substring(i - m + 1));
                    return n;
                }
                if((i==input.length()-1)){//第一个判断，结尾时最后一个是数字
                    if (input.charAt(i - m) == '-') {//判断数字前的符号是否为负
                        n = n - Integer.parseInt(input.substring(i - m + 1));
                    } else if (!Character.isDigit(input.charAt(i - m))) {//判断数字前的符号是否为正
                        n = n + Integer.parseInt(input.substring(i - m + 1));
                    }
                    m = 0;
                }

                else if(!Character.isDigit(input.charAt(i + 1))&&m>i){//第二个判断，开头时第一个是数字
                    n = n + Integer.parseInt(input.substring(0,i+1));
                    m=0;
                }

                else if (!Character.isDigit(input.charAt(i + 1))||i+1==input.length()) {//第三个判断，正常运算

                    if (input.charAt(i - m) == '-') {
                        n = n - Integer.parseInt(input.substring(i - m + 1, i + 1));
                    } else if (!Character.isDigit(input.charAt(i - m))) {
                        n = n + Integer.parseInt(input.substring(i - m + 1, i + 1));
                    }
                    m = 0;

                }
            }
        }

        return n;
    }
}
