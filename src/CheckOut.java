import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        boolean anotherYN = SafeInput.getYNConfirm(in, "Do you have an item?");
        while(anotherYN)
        {
            double price = (SafeInput.getRangeDouble(in, "Enter the price of the item: ", .50, 9.99));
            sum+=price;
            anotherYN = (SafeInput.getYNConfirm(in, "Do you have another item?"));
        }
        System.out.printf("The total cost is: %.2f",sum);
    }
}