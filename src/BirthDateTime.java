import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hours = 0;
        int minutes = 0;
        year = (SafeInput.getRangedInt(in, "Enter your birth year: ", 1950, 2010));
        month = (SafeInput.getRangedInt(in, "Enter your birth month: ", 1, 12 ));
        switch(month)
        {
            case 2:
                day = (SafeInput.getRangedInt(in, "Enter your birth day: ", 1, 29));
                break;
            case 4,6,9:
                day = (SafeInput.getRangedInt(in, "Enter your birth day: ", 1, 30));
                break;
        }
        day = (SafeInput.getRangedInt(in, "Enter your birth day: ", 1, 31));
        hours = (SafeInput.getRangedInt(in, "Enter your birth hour: ", 1, 24));
        minutes = (SafeInput.getRangedInt(in, "Enter your birth minute: ", 1, 59));
        System.out.println("Your birth year is " + year + ", month is " + month + ", day is " + day + ", hour is " + hours + ", and minute is " + minutes);
    }
}
