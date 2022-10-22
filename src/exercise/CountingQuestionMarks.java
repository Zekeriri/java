package exercise;

public class CountingQuestionMarks {
    public static void main(String[] args) {
        System.out.println(countQuestionMark("ab???????ab"));
    }
    public static int countQuestionMark(String str) {
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i,i+1).equals("?")) {
                count++;
            }
        }
        return count;
    }
}
