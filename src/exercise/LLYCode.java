package exercise;

public class LLYCode {
    public static void main(String[] args) {
        int netIncome = calcNetIncome("25000 gross income, -200 water, electricity:-300");
        System.out.println("Net Income = " + netIncome);
    }

    public static int calcNetIncome(String input) {
        int m = 0, n = 0;

        for (int i = 0; i < input.length(); i++) {//�����ַ���
            if (Character.isDigit(input.charAt(i))) {//�ж��Ƿ�Ϊ����
                m++;//���ֵĳ���
                if (input.length()==m) {
                    n = n + Integer.parseInt(input.substring(i - m + 1));
                    return n;
                }
                if((i==input.length()-1)){//��һ���жϣ���βʱ���һ��������
                    if (input.charAt(i - m) == '-') {//�ж�����ǰ�ķ����Ƿ�Ϊ��
                        n = n - Integer.parseInt(input.substring(i - m + 1));
                    } else if (!Character.isDigit(input.charAt(i - m))) {//�ж�����ǰ�ķ����Ƿ�Ϊ��
                        n = n + Integer.parseInt(input.substring(i - m + 1));
                    }
                    m = 0;
                }

                else if(!Character.isDigit(input.charAt(i + 1))&&m>i){//�ڶ����жϣ���ͷʱ��һ��������
                    n = n + Integer.parseInt(input.substring(0,i+1));
                    m=0;
                }

                else if (!Character.isDigit(input.charAt(i + 1))||i+1==input.length()) {//�������жϣ���������

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
