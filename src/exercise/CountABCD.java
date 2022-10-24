package exercise;

public class CountABCD {
    public static void main(String[] args) {
        System.out.println(countABCD("ABCDSQWDDABCEDJF"));
    }

public static int countABCD(String input){
        int count=0;
    for (int i = 0; i < input.length()-3; i++) {
        if (input.substring(i,i+4).equalsIgnoreCase("ABCD"))
            count++;
    }
    return count;
}
}
