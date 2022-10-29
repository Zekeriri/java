package week7;

import java.nio.charset.MalformedInputException;

/*
 * CW1 Week 7
 */
public class Clock
{
    private int hours;
    private int minutes;

    // CW1 #7.1
    // Creates a clock whose initial time is h hours and m minutes.
    public Clock(int h, int m)
    {
        hours=h;
        minutes=m;
    }

    // CW1 #7.2
    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    public Clock(String s)
    {
        hours=Integer.parseInt(s.substring(0,2));
        minutes=Integer.parseInt(s.substring(3,5));
    }

    // CW1 #7.3
    // Returns a string representation of this clock, using the format HH:MM.
    public String toString()
    {

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
    public boolean isEarlierThan(Clock that)
    {
        if (this.hours< that.hours)
            return true;
        else if (this.hours== that.hours && this.minutes< that.minutes)
            return true;
        else return false;
    }

    // CW1 #7.5
    // Adds 1 minute to the time on this clock.
    public void tick()
    {
        minutes+=1;
        hours+=minutes/60;
        minutes=minutes%60;
        hours=hours%24;
    }

    // CW1 #7.6
    // Adds delta minutes to the time on this clock.
    public void tock(int delta)
    {
        minutes+=delta;
        hours+=minutes/60;
        minutes=minutes%60;
        hours=hours%24;
    }

    // Test client
    public static void main(String[] args)
    {
        Clock clock1 = new Clock(1, 0);
        Clock clock2 = new Clock("02:30");

        System.out.println(clock1);
        System.out.println(clock2);

        System.out.println(clock1.isEarlierThan(clock2));

        clock1.tick();
        clock2.tock(100);

        System.out.println(clock1);
        System.out.println(clock2);

    }
}
