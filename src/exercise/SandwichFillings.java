package exercise;

public class SandwichFillings {
    public static void main(String[] args) {
        System.out.println(sandwichFillings("breadtunabred"));
    }
    //找夹心
    public static String sandwichFillings(String input) {
        int found=0;
        int first=0;
        int last=0;
        int index=0;
        //第一片bread
        found=input.indexOf("bread",0);
        if (found==-1) return "none";
        first=found+5;
        //第二片bread
        found=input.indexOf("bread",first);
        if (found==-1) return "none";
        last=found;
        //找剩下的bread
        index=last+5;
        found=input.indexOf("bread",index);
        while (found!=-1){
            last=found;
            index=last+5;
            found=input.indexOf("bread",index);
        }
        return input.substring(first,last);
    }

}
