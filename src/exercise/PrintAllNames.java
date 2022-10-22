package exercise;

public class PrintAllNames {
    public static void main(String[] args) {
        printAllNames("name = *Eren*2313name = *Mikasa*12312123name = *Armin*");
    }

    //
    public static void printAllNames(String str){
        int index=0;
        int found;
        int start;
        int end;
        do {
            found=str.indexOf("name = *",index);
            if (found==-1)
                break;
            start=found+8;
            found=str.indexOf("*",start);
            end=found;
            System.out.println(str.substring(start,end));
            index=end+1;
        } while( found !=-1);

    }
}