import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter your SSN [***-**-****] ", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("SSN is " + ssn);
        String ucStudentMNo = SafeInput.getRegExString(in, "Enter your UC student M number [M*****] ", "(M|m)\\d{5}");
        System.out.println("M number is " + ucStudentMNo);
        String menuChoice = SafeInput.getRegExString(in, "Enter your menu choice [O/S/V/Q] ", "[OoSsVvQq]");
        System.out.println("Menu choice is " + menuChoice);
    }
}