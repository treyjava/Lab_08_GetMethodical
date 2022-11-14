import java.util.Scanner;

public class main
{

    /**
     * Takes Y or N and returns true or false
     *
     * @param pipe Scanner for console input
     * @param prompt String indicating what to input
     * @return Boolean true of false based on Y or N
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean retVal = false;
        boolean done = false;
        String inputYN = "";
        String trash = "";

        do
        {
            System.out.print(prompt + " [Y/N]: ");
            inputYN = pipe.nextLine();
            if(inputYN.equalsIgnoreCase("Y"))
            {
                retVal = true;
                done = true;
            }
            else if(inputYN.equalsIgnoreCase("N"))
            {
                done = true;
                retVal = false;
            }
            else
            {
                System.out.println("You must enter Y or N. ");
            }
        }while(!done);

        return retVal;
    }
}