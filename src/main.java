import java.util.Scanner;

public class main
{
    /**
     * Prompts the user to input an integer
     * @param pipe
     * @param prompt Prompts the user to input
     * @return
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + "; ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                System.out.println("\nYou said your favorite ret val is " + retVal + ".");
                done = true;

            } else {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a valid integer, not " + trash + ".");
            }
        }while(!done);

        return retVal;
    }
}
