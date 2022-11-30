package week10;


/*
 * Exercise and CW1 Week #9
 */
public class CuckooClock extends Clock {


    // Exercise #9.4
    // Creates a Cuckoo clock whose initial time is h hours and m minutes.
    public CuckooClock(int h, int m) {
        super(h,m);
    }


    // CW1 #9.1
    // Adds 1 minute to the time on this Cuckoo clock.
    // In addition,  it prints "Cuckoo!" at the start of every hour
    // It prints one time for each hour
    // Whether it is morning or night does not change the number of times it prints
    // For example, for 14:00, it prints "Cuckoo!" two times;
    //              and for 00:00 and 12:00, it prints "Cuckoo!" twelve times.
    @Override
    public void tick() {
        super.tick();
        if(getMinutes()==0) {
            int times=getHours()%12;
            if (times==0){
                times=12;
            }
            for (int i = 0; i < times; i++) {
                System.out.println("Cuckoo!");
            }

        }


    }


    // Test Client
    public static void main(String[] args) {
        CuckooClock cc1 = new CuckooClock(0, 58);
        cc1.tick();
        cc1.tick();  // Cuckoo!
        System.out.println(cc1);  // 01:00

        CuckooClock cc2 = new CuckooClock(13, 59);
        cc2.tick();  // Cuckoo!
		             // Cuckoo!


    }
}