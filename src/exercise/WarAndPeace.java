package exercise;

public class WarAndPeace {
    public static void main(String[] args) {
        System.out.println(warAndPeace("there was never a good ar, or a bad peace"));
    }
    public static boolean warAndPeace(String text) {
        int foundWar=0;
        int foundPeace=0;
        foundWar=text.indexOf("war",0);
        foundPeace=text.indexOf("peace",0);
        if (foundPeace !=-1 && foundWar !=-1)
            return true;
            else
            return false;
    }
}
