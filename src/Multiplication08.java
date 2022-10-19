import java.util.Scanner;

public class Multiplication08
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please a number to find multiplication table :- "); // display a msg to user for table.
        int n = scanner.nextInt(); // to input a number for user to display a table for the number.

        for (int i = 1; i <=12 ; i++)
        {
            System.out.println(n+ " x " +i+" = " +n*i); //result outcome

        }

    }
}
