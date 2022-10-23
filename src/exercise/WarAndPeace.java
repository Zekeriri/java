package exercise;

public class WarAndPeace {
    public static void main(String[] args) {
        System.out.println(warAndPeace(""));
    }
    //
    public static boolean warAndPeace(String text) {
        if (foundCount(text,"war")==foundCount(text,"peace"))
            return true;
        else
            return false;
    }
    //
    public static int foundCount(String text,String keyWord){
        int found=0;
        int index=0;
        int count=0;
        found=text.indexOf(keyWord,0);
        while(found!=-1)
        {
            count++;
            index=found+keyWord.length();
            found=text.indexOf(keyWord,index);
        }
        return count;
    }
}
