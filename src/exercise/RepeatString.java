package exercise;

public class RepeatString {
    public static void main(String[] args) {
        System.out.println(repeatString("abc",3));
    }

    public static String repeatString(String str, int count){
        String result = "";
        for (int i = 0; i < count; i++) {
            result=result +str;
        }
        return result;
    }
}
