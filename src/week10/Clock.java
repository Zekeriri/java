package week10;

/*
 * CW1 Week #7, to be used again in Week #9 and Week #10
 * Complete using your codes in Week #7 and Week #9
 *
 */

public class Clock {
    private int hours;
    private int minutes;


    // CW1 #7.1 -> Exercise #10.1
    // Creates a clock whose initial time is h hours and m minutes.
    // Throws an IllegalArgumentException if either hours is not between 0 and 23,
    //     or minutes not between 0 and 59
    public Clock(int h, int m) {
        if (h<0||h>23||m<0||m>59){
            throw new IllegalArgumentException();
        }
        hours=h;
        minutes=m;
    }


    // CW1 #7.2 -> Exercise #10.2
    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    // Throws an IllegalArgumentException if either the string argument is not in this format,
    //     or if it does not correspond to a valid time between 00:00 and 23:59.
    public Clock(String s) {
        if (s.length()!=5||s.charAt(2)!=':'){
            throw new IllegalArgumentException();
        }
        hours=Integer.parseInt(s.substring(0,2));
        minutes=Integer.parseInt(s.substring(3,5));
        if (hours<0||hours>23||minutes<0||minutes>59){
            throw new IllegalArgumentException();
        }
    }


    // CW1 #7.3 -> Exercise #10.3
    // Adds delta minutes to the time on this clock.
    // Throws an IllegalArgumentException if delta is negative,
    //     and use the message "Illegal negative delta " followed by the negative number.
    public String toString() {
        String h = hours+"";
        String m = minutes+"";
        if (hours<10)
            h="0"+hours;
        if (minutes<10)
            m="0"+minutes;
        return h+":"+m;

    }

    // CW1 #7.4
    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {


        return false;
    }

    // CW1 #7.5
    // Adds 1 minute to the time on this clock.
    public void tick() {
        minutes+=1;
        hours+=minutes/60;
        minutes=minutes%60;
        hours=hours%24;
    }


    // CW1 #7.6 -> Exercise #10.3
    // Adds delta minutes to the time on this clock.
    // Throws an IllegalArgumentException if delta is negative,
    //     and use the message "Illegal negative delta " followed by the negative number.
    public void tock(int delta) {
        if (delta<0){
            String errorMessage = "Illegal negative delta "+delta;
            throw new IllegalArgumentException(errorMessage);
        }
        minutes+=delta;
        hours+=minutes/60;
        minutes=minutes%60;
        hours=hours%24;
    }

    // Exercise #10.4 Polymorphic Tick Function
    // Takes a Clock object and calls the tick method on it
    public static void tick(Clock clock) {
        clock.tick();
    }


    // Getters Added:

    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }


    // Test client
    public static void main(String[] args) {

        // Testing Exercise #10.1
        Clock clock1 = new Clock(1, 0);
        System.out.println(clock1);

        try {
            Clock clock2 = new Clock(50, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument in constructor 1!");
        }

        // Testing Exercise #10.2
        Clock clock3 = new Clock("02:30");
        System.out.println(clock3);

        try {
            Clock clock4 = new Clock("50:00");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument in constructor 2!");
        }

        // Testing Exercise #10.3
        Clock clock5 = new Clock("02:30");
        clock5.tock(100);
        System.out.println(clock5);

        try {
            clock5.tock(-50);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Testing Exercise #10.4
        AlarmClock clock6 = new AlarmClock(5, 59, 6, 0);
        Clock.tick(clock6);  // Beep beep beep beep!



    }

}
