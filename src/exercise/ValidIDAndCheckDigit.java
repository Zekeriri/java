package exercise;

public class ValidIDAndCheckDigit {
    public static void main(String[] args) {
        System.out.println(isValidID("00000000X"));
    }
    //
    public static boolean isValidID(String id) {
        int len=id.length();
        int sum=0;
        int last=-1;
        int expectLast;
        boolean flag = false;
        //���һλ�������ַ�
        if (!Character.isDigit(id.charAt(len-1))  &&  !(id.charAt(len-1)=='X'))
            return false;
        //����5λ
        if (len<5) return false;
//        //����ĸ
//        for (int i = 0; i < len-1; i++) {
//            if ((id.charAt(i) >='a'&& id.charAt(i)<='z') || (id.charAt(i)>='A'&&id.charAt(i)<='Z')) {
//            flag=true;
//            break;
//            }
//        }
//        if (!flag) return false;
//        //�С�-��
//        flag=false;
//        for (int i = 0; i < len-1; i++) {
//            if (id.charAt(i)=='-') {flag=true; break;}
//        }
//        if (!flag) return false;
        //���һλ����
        for (int i = 0; i < len-1; i++) {
            if (Character.isDigit(id.charAt(i)))
                sum=sum+Integer.parseInt(id.substring(i,i+1));
        }

        //���һλΪX
        if (id.charAt(len-1) != 'X')
            last = Integer.parseInt(id.substring(len - 1, len));
        expectLast = sum % 11;
        if (expectLast == 10 && id.charAt(len - 1) == 'X') return true;
        else if (last==expectLast) return true;
        else return false;
    }
}
